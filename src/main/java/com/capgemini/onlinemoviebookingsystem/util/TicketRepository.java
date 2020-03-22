package com.capgemini.onlinemoviebookingsystem.util;
import java.util.*;

import com.capgemini.onlinebookingsystem.dto.MovieBooking;
import com.capgemini.onlinebookingsystem.dto.Ticket;
public class TicketRepository {
static HashMap<Integer,Ticket> ticketDetails=new HashMap<Integer,Ticket>();
static Integer ticketId;
Ticket t=new Ticket();
TicketRepository(Integer ticketId,int noOfSeats,String[] seatName,String screenName){
	t.setNoOfSeats(noOfSeats);
	//t.setBookingRef(bookingRef);
	t.setScreenName(screenName);
	t.setSeatName(seatName);
	//t.setTicketStatus(ticketStatus);
	t.setTicketId(ticketId);
	t.setTicketId(ticketId);
	ticketId++;
	//ticketDetails.put(ticketId,t);
	//t.setTicketStatus(TicketStatus.completed);
	
}
public Ticket getTicketDetails(Integer ticketId)
{
	return ticketDetails.get(ticketId);
}
public TicketRepository()
{
	
}
 
}
