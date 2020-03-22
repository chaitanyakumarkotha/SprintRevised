package com.capgemini.onlinemoviebookingsystem.dao;
import java.util.*;

import com.capgemini.onlinebookingsystem.dto.Seats;
public class SelectedSeatsDAO {
	public static HashMap<Integer,Seats[]> seatsList=new HashMap<Integer,Seats[]>();
	
	public  void SeatsDAO(Integer showId,Seats[]s)
	{
		seatsList.put(showId, s);
		
		
	}
	public Seats[] calculateTotalCost(Integer showId)
	{
		return seatsList.get(showId);
	}
	

}
