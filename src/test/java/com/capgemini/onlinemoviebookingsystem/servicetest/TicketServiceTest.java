package com.capgemini.onlinemoviebookingsystem.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.capgemini.onlinemoviebookingsystem.service.TicketService;

public class TicketServiceTest {

	@Test
	public void TicketTest()
	{
		TicketService obj = new TicketService();
		Throwable expected = assertThrows(Exception.class,()->{obj.showTicket(null);});
		assertEquals("showId is null", expected.getMessage());
	}
}
