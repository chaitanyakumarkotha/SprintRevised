package com.capgemini.onlinemoviebookingsystem.servicetest;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.capgemini.onlinebookingsystem.exception.OutOfBoundException;
import com.capgemini.onlinemoviebookingsystem.service.CancelTicket;

public class CancelSeatServiceTest {

	@Test
	public void CancelSeats() throws OutOfBoundException
	{
		CancelTicket obj = new CancelTicket();
		Throwable exp = assertThrows(Exception.class,()->{obj.cancelTickets(null);});
		assertEquals("Array is Null", exp.getMessage());
		
	}
}
