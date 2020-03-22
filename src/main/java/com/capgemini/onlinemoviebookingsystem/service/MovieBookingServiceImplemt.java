package com.capgemini.onlinemoviebookingsystem.service;
import java.util.*;
import com.capgemini.onlinemoviebookingsystem.dao.*;
import com.capgemini.onlinemoviebookingsystem.util.SeatsRepository;
import com.capgemini.onlinemoviebookingsystem.util.TicketRepository;

public class MovieBookingServiceImplemt implements MovieBookingService {
	MovieBookingDAOImplement dao;
	public MovieBookingServiceImplemt() {
		dao = new MovieBookingDAOImplement();
	}
	/*public List<SeatsRepository> chooseSeats()
	{
		
	}*/
	public double calculateTotalCost()
	{
		return dao.calculateTotalCost();
	}
	public String choosePaymentMethod() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean makePayment(String s, Double d) {
		// TODO Auto-generated method stub
		return false;
	}
	public TicketRepository showTicket() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean cancelBookings(SeatsRepository s) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<SeatsRepository> chooseSeats() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
