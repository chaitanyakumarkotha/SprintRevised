package com.capgemini.onlinemoviebookingsystem.dao;
import java.util.*;

import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinebookingsystem.dto.Ticket;
import com.capgemini.onlinemoviebookingsystem.util.ShowRepoistory;
import com.capgemini.onlinemoviebookingsystem.util.TicketRepository;
public class TicketDAO {
	public static HashMap<Integer,Ticket> ticketDetails=new HashMap<Integer,Ticket>();
	
		PaymentDAO dao=new PaymentDAO();
	public Ticket details(Integer showId)
	{
			return dao.bookingDetails.get(showId).getTicket();
	}

}
