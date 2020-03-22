package com.capgemini.onlinebookingsystem.dto;
import java.util.*;

//import com.capgemini.onlinemoviebookingsystem.util.Show;

import java.time.*;

public class MovieBooking {
	Integer bookingId;
	Integer movieId;
	Integer showId;
    Show show;
    Ticket ticket;
    Seats[] seats;
    public Show getShow() {
		return show;
	}
	public void setShow(Show s) {
		this.show = s;
	}
	LocalDate date;
    double totalCost;
    Integer transcationid;
   
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Integer getTranscationid() {
		return transcationid;
	}
	public void setTranscationid(Integer transcationid) {
		this.transcationid = transcationid;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Seats[] getSeats() {
		return seats;
	}
	public void setSeats(Seats[] s) {
		this.seats = s;
	}
    public String toString()
    {
    	return ("");
    }

}
