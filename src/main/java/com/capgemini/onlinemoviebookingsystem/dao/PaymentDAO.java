package com.capgemini.onlinemoviebookingsystem.dao;
import java.time.LocalDate;
import java.util.*;

import com.capgemini.onlinebookingsystem.dto.MovieBooking;
import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinebookingsystem.dto.Show;
import com.capgemini.onlinebookingsystem.dto.Ticket;
import com.capgemini.onlinemoviebookingsystem.util.CustomerRepository;
import com.capgemini.onlinemoviebookingsystem.util.ShowRepoistory;
//import com.capgemini.onlinemoviebookingsystem.util.TicketRepository;
public class PaymentDAO {
	static Integer transcationId=50001;
	
	public static HashMap<Integer,MovieBooking> bookingDetails=new HashMap<Integer,MovieBooking>();
	CustomerRepository customer =new CustomerRepository();
	Ticket ticket=new Ticket();
	ShowRepoistory show=new ShowRepoistory();
	MovieBooking booking=new MovieBooking();
	public Ticket booking(Integer showId,double cost)
	{
		int theaterId = 0;
		int  movieId = 0;
		String screenName = null;
		Show s = null;
	
		for(int i=0;i<show.showlist.size();i++)
		{
			if (show.showlist.get(i).getShowId()==showId)
			{
				
			    theaterId=show.showlist.get(i).getTheaterId();
				movieId=show.showlist.get(i).getMovieId();
				screenName=show.showlist.get(i).getScreenID();
			}		
	   }
		Seats[] seats=SelectedSeatsDAO.seatsList.get(showId);
		String[] name=new String[seats.length];
		for(int i=0;i<seats.length;i++)
		{
			name[i]=Integer.toString(seats[i].getSeatId());
		}
		
		Integer noofseats=seats.length;
	
		Integer bookingId=customer.customerDetails.get(0).getCustomerId()+theaterId+movieId;
		booking.setBookingId(bookingId);
		booking.setDate(LocalDate.of(2020, 02, 15));
		booking.setMovieId(movieId);
		booking.setSeats(seats);
		booking.setShow(s);
		booking.setShowId(showId);
		booking.setTotalCost(cost);
		booking.setTranscationid(transcationId);
		Integer ticketid=bookingId+transcationId;
		ticket.setNoOfSeats(noofseats);
		ticket.setScreenName(screenName);
		ticket.setSeatName(name);
		ticket.setTicketId(ticketid);
		ticket.setTicketStatus(true);
		booking.setTicket(ticket);
		bookingDetails.put(showId,booking);
		transcationId++;
		return bookingDetails.get(showId).getTicket();
		

}
	
}