package com.capgemini.onlinebookingsystem.dto;



public class Ticket {
	 private Integer ticketId;
	private Integer noOfSeats;
	private String[] seatName;
	private MovieBooking bookingRef;
	private Boolean ticketStatus;
	private String screenName;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public Integer getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String[] getSeatName() {
		return seatName;
	}

	public void setSeatName(String[] seatName) {
		this.seatName = seatName;
	}

	public MovieBooking getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(MovieBooking bookingRef) {
		this.bookingRef = bookingRef;
	}

	public Boolean getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(Boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

public String toString()
{
	return ("TicketId : "+this.getTicketId()+" "+"No of Seats : "+this.getNoOfSeats());
}
}
