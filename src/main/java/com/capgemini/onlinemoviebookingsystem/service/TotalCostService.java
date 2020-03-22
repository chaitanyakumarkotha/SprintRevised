package com.capgemini.onlinemoviebookingsystem.service;

import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinebookingsystem.exception.OutOfBoundException;
import com.capgemini.onlinemoviebookingsystem.dao.SelectedSeatsDAO;

public class TotalCostService {
	 double totalCost=0;
	 SelectedSeatsDAO seats =new SelectedSeatsDAO();
	public double calculateTotalCost(Integer showId) throws OutOfBoundException
	{
		if(showId==null)
		{
			throw new OutOfBoundException("showId is null");
		}
		Seats[] s=seats.calculateTotalCost(showId);
		double seatPrice=s[0].getSeatPrice() ;
		System.out.println("The price each seat is :"+ seatPrice);
		totalCost=s.length*seatPrice;
		
		return totalCost;
	}

}
