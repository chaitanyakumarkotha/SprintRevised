package com.capgemini.onlinebookingsystem.dto;

import com.capgemini.onlinemoviebookingsystem.util.BookingState;

public class Seats {
	private Integer seatId;
	private Enum seatStatus;
	private double seatPrice;
	public Seats() {

}
public Seats blockSeat()
{
	this.seatStatus=BookingState.Blocked;
	return this;	
}

public Seats bookSeat()
{
	this.seatStatus=BookingState.Booked;
	return this;
}
public Seats cancelSeatBooking()
{
	return null;
}
public Seats unBlockSeat()
{
	this.seatStatus=BookingState.Available;
	return this;
}
public Integer getSeatId() {
	return seatId;
}
public void setSeatId(Integer seatId) {
	this.seatId = seatId;
}
public Enum getSeatStatus() {
	return seatStatus;
}
public void setSeatStatus(Enum seatStatus) {
	this.seatStatus = seatStatus;
}
public double getSeatPrice() {
	return seatPrice;
}
public void setSeatPrice(double seatPrice) {
	this.seatPrice = seatPrice;
}


}
