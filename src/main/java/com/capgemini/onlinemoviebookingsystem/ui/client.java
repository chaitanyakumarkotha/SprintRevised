package com.capgemini.onlinemoviebookingsystem.ui;
import java.util.*;

import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinebookingsystem.dto.Ticket;
import com.capgemini.onlinebookingsystem.exception.OutOfBoundException;
import com.capgemini.onlinemoviebookingsystem.service.CancelTicket;
import com.capgemini.onlinemoviebookingsystem.service.ChooseSeatsService;
import com.capgemini.onlinemoviebookingsystem.service.MovieBookingServiceImplemt;
import com.capgemini.onlinemoviebookingsystem.service.PaymentMethodService;
import com.capgemini.onlinemoviebookingsystem.service.PaymentService;
import com.capgemini.onlinemoviebookingsystem.service.TicketService;
import com.capgemini.onlinemoviebookingsystem.service.TotalCostService;
import com.capgemini.onlinemoviebookingsystem.util.SeatsRepository;

public class client {
	public static void main(String[] args) throws OutOfBoundException  {
		// TODO Auto-generated method stub
		ChooseSeatsService service=new ChooseSeatsService();
		 SeatsRepository s=new SeatsRepository(201);
		 SeatsRepository s1=new SeatsRepository(202);
		 SeatsRepository s2=new SeatsRepository(203);
		 SeatsRepository s3=new SeatsRepository(204);
		TotalCostService cost=new TotalCostService();
		 PaymentMethodService method=new PaymentMethodService();
		 PaymentService pay=new PaymentService();
		 TicketService ticket=new TicketService();
		 CancelTicket cancel=new CancelTicket();
		 Scanner sc =new Scanner(System.in);
		 int i=1;
		 Seats [] d1 = null;
		 while(i>0) {
		System.out.println("Enter 1 to book the tickets");
		System.out.println("Enter 2 to cancel the tickets");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
		{
			System.out.println("Enter showid");
			int showid=sc.nextInt();
			try {
			d1=service.chooseSeats(showid);
			}
			catch(OutOfBoundException e)
			{
				System.out.println(e.getMessage());
			}
			//System.out.println(d1.length);
			System.out.println("The seats are blocked");
			Double d=cost.calculateTotalCost(showid);
			//System.out.println("Total Cost"+d);
			System.out.println("Choose the paymentMethod");
			String methodname=method.choosePaymentMethod();
			System.out.println(methodname);
			System.out.println("Are you sure to book the tickets");
			System.out.println("Enter 1 if you want to confirm booking");
			System.out.println("Enter 2 if you dont want to book");
			int option =sc.nextInt();
			switch(option)
			{
			case 1:
			{
				boolean success=pay.makePayment(methodname,d,showid);
				if(success==true)
				{
					System.out.println("Ticket successfully booked");
					
					Ticket t=ticket.showTicket(showid);
					System.out.println(t);
					break;
				}
			}
			case 2:
			{
				
			}
			}
			
			//service.showTicket();
			System.out.println("If you want to continue booking press any number except 0");
			System.out.println("If you want to exist press 0");
			i=sc.nextInt();
			continue;
		
			}
		
		case 2:
		{
			cancel.cancelTickets(d1);
			System.out.println("If you want to continue booking press any number except 0");
			System.out.println("If you want to exist press 0");
			i=sc.nextInt();
			
		}
		}
	}
		 sc.close();
	}
	

}
