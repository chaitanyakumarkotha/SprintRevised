package com.capgemini.onlinemoviebookingsystem.dao;
import java.util.*;

import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinemoviebookingsystem.util.SeatsRepository;
import com.capgemini.onlinemoviebookingsystem.util.TicketRepository;

interface MovieBookingDAO {
	public Seats[] chooseSeats();
	public double calculateTotalCost();
	public String choosePaymentMethod();
	public boolean makePayment(String s, Double d);
	public TicketRepository showTicket();
	public boolean cancelBookings(SeatsRepository s);


}
