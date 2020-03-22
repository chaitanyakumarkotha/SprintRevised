package com.capgemini.onlinemoviebookingsystem.service;

import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinebookingsystem.exception.OutOfBoundException;
import com.capgemini.onlinemoviebookingsystem.dao.ChooseSeats;
import com.capgemini.onlinemoviebookingsystem.dao.SelectedSeatsDAO;
import com.capgemini.onlinemoviebookingsystem.util.SeatsRepository;
import java.util.*;

public class ChooseSeatsService {
	ChooseSeats seats=new ChooseSeats();
	 SeatsRepository s=new SeatsRepository();
	static List<Integer> selectedseats=new ArrayList<Integer>();
	//public static HashMap<Integer,Seats[]> seatsBooked=new HashMap<Integer,Seats[]>();
	SelectedSeatsDAO seatsBooked =new SelectedSeatsDAO();
	public Seats[] chooseSeats(int showId) throws OutOfBoundException
	{
		if(showId<0)
		{
			throw new OutOfBoundException("Warning Seats Exceeded");
		}
				System.out.println("The availabe seats for the show ");
		
		
		for (int i = 0; i < 50; i++) {
			if(seats.isBooked(i+1, showId))
			{
				System.out.print(i+1+"@ ");
				
				
			}
			if(seats.isBlocked(i+1, showId))
			{
				System.out.print(i+1+"# ");
				
				
			}
			if(seats.isAvailable(i+1, showId))
			{
				System.out.print(i+1+"* ");
				
			}
			if((i+1)%10==0)
			{
				System.out.println();
			}
	}
		System.out.println("* for the available seats");
		System.out.println("@ for the booked seats");
		System.out.println("# for the blocked seats");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of seats you want to book");
		int noofseats=sc.nextInt();
		
		System.out.println("Enter the seats id you want to book");
		int [] a=new int[noofseats];
		Seats[] g =new Seats[noofseats];
		for(int i=0;i<noofseats;i++)
		{
			int seatid=sc.nextInt();
			a[i]=seatid;
			if(seats.isAvailable(a[i], showId))
			{
				seats.blockSeat(seatid, showId);
				selectedseats.add(seatid);
				
				g[i]=s.seatDetails.get(showId)[seatid-1];
				

			}
			else
			{
				System.out.println("The seat no is not available try another one ");
				i--;
			}
			
		}
		seatsBooked.SeatsDAO(showId, g);
		return g;
		
		
	}

}
