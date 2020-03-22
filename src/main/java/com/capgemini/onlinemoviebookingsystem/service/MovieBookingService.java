package com.capgemini.onlinemoviebookingsystem.service;

import java.util.*;

import com.capgemini.onlinemoviebookingsystem.util.SeatsRepository;
import com.capgemini.onlinemoviebookingsystem.util.TicketRepository;

public interface  MovieBookingService {
	public List<SeatsRepository> chooseSeats();
	public double calculateTotalCost();
	public String choosePaymentMethod();
	public boolean makePayment(String s, Double d);
	public TicketRepository showTicket();
	public boolean cancelBookings(SeatsRepository s);

}
