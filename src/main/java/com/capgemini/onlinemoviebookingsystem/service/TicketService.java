package com.capgemini.onlinemoviebookingsystem.service;

import com.capgemini.onlinebookingsystem.dto.Ticket;
import com.capgemini.onlinebookingsystem.exception.OutOfBoundException;
import com.capgemini.onlinemoviebookingsystem.dao.TicketDAO;

public class TicketService {
	TicketDAO dao=new TicketDAO();
	public Ticket showTicket(Integer showId) throws OutOfBoundException
	{
		if(showId==null)
		{
			throw new OutOfBoundException("showId is null");
		}
		Ticket t=dao.details(showId);
		
		return t;
	}

}
