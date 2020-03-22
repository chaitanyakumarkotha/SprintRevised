package com.capgemini.onlinemoviebookingsystem.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.onlinemoviebookingsystem.service.PaymentService;

public class PaymentServiceTest {

	@Test
	public void PaymentServiceTesting()
	{
		PaymentService obj = new PaymentService();
		boolean exp = obj.unBlockSeats(28);
		assertEquals(false, exp);
	}
}
