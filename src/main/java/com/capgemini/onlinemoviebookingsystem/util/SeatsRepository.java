package com.capgemini.onlinemoviebookingsystem.util;
import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinemoviebookingsystem.util.BookingState;
import com.capgemini.onlinemoviebookingsystem.util.SeatsRepository;
import java.util.*;

public class SeatsRepository {
	public SeatsRepository()
	{
		
	}
	public static HashMap<Integer,Seats[]> seatDetails=new HashMap<Integer,Seats[]>();
	 public SeatsRepository(int showId)
	{
		int n=50;
		int seatprice=150;
		Seats[] seatArray=new Seats[n];
		for (int i = 0; i < n; i++) {
			Seats seat=new Seats();
			seat.setSeatId(i+1);
			seat.setSeatPrice(seatprice);
			seat.setSeatStatus(BookingState.Available);
			seatArray[i]=seat;
		}
		seatDetails.put(showId, seatArray);
	}
	
}
