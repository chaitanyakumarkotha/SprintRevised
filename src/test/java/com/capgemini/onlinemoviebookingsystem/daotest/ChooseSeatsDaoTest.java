package com.capgemini.onlinemoviebookingsystem.daotest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.capgemini.onlinebookingsystem.dto.Seats;
import com.capgemini.onlinemoviebookingsystem.dao.ChooseSeats;
import com.capgemini.onlinemoviebookingsystem.service.ChooseSeatsService;
import com.capgemini.onlinemoviebookingsystem.service.PaymentService;
import com.capgemini.onlinemoviebookingsystem.util.BookingState;
import com.capgemini.onlinemoviebookingsystem.util.SeatsRepository;

public class ChooseSeatsDaoTest {
	
	@Test
	public void bookSeatsTest()
	{
		ChooseSeatsService obj = new ChooseSeatsService();
		Throwable expected = assertThrows(Exception.class,()->{obj.chooseSeats(-2);});
		//boolean exp = obj.unBlockSeats(201);
		assertEquals("Warning Seats Exceeded",expected.getMessage() );
		
		
		//assertEquals(true,obj.bookSeat(51,201));
	}

}
