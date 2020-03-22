package com.capgemini.onlinemoviebookingsystem.dao;

import com.capgemini.onlinebookingsystem.dto.Seats;
//import com.capgemini.onlinebookingsystem.dto.Show;
import com.capgemini.onlinemoviebookingsystem.util.BookingState;
import com.capgemini.onlinemoviebookingsystem.util.SeatsRepository;

//import Repository.BookingState;
//import collections.ShowCollection;

public class ChooseSeats {
	//SeatsRepository seat=new SeatsRepository();
	public boolean bookSeat(Integer seatId,Integer showId)
	{
		Seats[] s=SeatsRepository.seatDetails.get(showId);
		if(s[seatId-1].bookSeat().getSeatStatus()==BookingState.Booked)
			{
			return true;
			}
		return false;
	}
	public boolean blockSeat(Integer seatId,Integer showId)
	{
		Seats[] s=SeatsRepository.seatDetails.get(showId);
		if(s[seatId-1].blockSeat().getSeatStatus()==BookingState.Blocked)
			{
			return true;
			}
		return false;
	}
	public boolean unBlockSeat(Integer seatId,Integer showId)
	{
		Seats[] s=SeatsRepository.seatDetails.get(showId);
		if(s[seatId-1].unBlockSeat().getSeatStatus()==BookingState.Available)
			{
			return true;
			}
		return false;
	}
	
	public boolean isBooked(Integer seatId,Integer showId)
	{
		Seats[] s=SeatsRepository.seatDetails.get(showId);
		if(s[seatId-1].getSeatStatus()==BookingState.Booked)
		{
			return true;
		}
		return false;
	}
	public boolean isBlocked(Integer seatId,Integer showId)
	{
		Seats[] s=SeatsRepository.seatDetails.get(showId);
		if(s[seatId-1].getSeatStatus()==BookingState.Blocked)
		{
			return true;
		}
		return false;
	}
	public boolean isAvailable(Integer seatId,Integer showId)
	{
		Seats[] s=SeatsRepository.seatDetails.get(showId);
		if(s[seatId-1].getSeatStatus()==BookingState.Available)
		{
			return true;
		}
		return false;
	}
}
