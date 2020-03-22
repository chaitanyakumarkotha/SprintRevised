package com.capgemini.onlinemoviebookingsystem.service;

import java.util.Map;

import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinebookingsystem.exception.OutOfBoundException;
import com.capgemini.onlinemoviebookingsystem.dao.SelectedSeatsDAO;
//import com.capgemini.onlinemoviebookingsystem.dao.SelectedSeatsDAO;

public class CancelTicket {
	public boolean cancelTickets(Seats [] d1) throws OutOfBoundException
	{
		if(d1==null)
		{
			throw new OutOfBoundException("Array is Null");
		}
		Integer showId = null;
		for(Map.Entry entry:SelectedSeatsDAO.seatsList.entrySet())
		{
			if(d1.equals(entry.getValue()))
			{
				showId=(Integer) entry.getKey();
				break;
			}
		}
		Seats []s=SelectedSeatsDAO.seatsList.get(showId);
		for(int i=0;i<s.length;i++)
		{
			s[i].unBlockSeat();
		}
		
		return true;
	}

}
