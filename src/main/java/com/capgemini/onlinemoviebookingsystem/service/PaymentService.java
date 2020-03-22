package com.capgemini.onlinemoviebookingsystem.service;

import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinemoviebookingsystem.dao.ChooseSeats;
import com.capgemini.onlinemoviebookingsystem.dao.PaymentDAO;
import com.capgemini.onlinemoviebookingsystem.dao.SelectedSeatsDAO;

public class PaymentService {
	ChooseSeats seats=new ChooseSeats();
	PaymentDAO dao=new PaymentDAO();

	public boolean makePayment(String methodName,Double cost,Integer showId)
	{
		Seats[] g=SelectedSeatsDAO.seatsList.get(showId);
		for(int i=0;i<g.length;i++) {
			seats.bookSeat(ChooseSeatsService.selectedseats.get(i),showId);
	}
		dao.booking(showId, cost);
		return true;

}
	public boolean unBlockSeats(Integer showId)
	{
		Seats[] g=SelectedSeatsDAO.seatsList.get(showId);
	 	for(int i=0;i<g.length;i++) {
			seats.unBlockSeat(ChooseSeatsService.selectedseats.get(i), showId);
	}
	 	return true;
}
}
