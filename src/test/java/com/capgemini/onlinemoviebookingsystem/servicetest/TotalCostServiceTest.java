package com.capgemini.onlinemoviebookingsystem.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.capgemini.onlinemoviebookingsystem.service.TotalCostService;

public class TotalCostServiceTest {

	@Test
	public void TotalServiceCost()
	{
		TotalCostService obj = new TotalCostService();
		Throwable expected = assertThrows(Exception.class,()->{obj.calculateTotalCost(null);});
		assertEquals("showId is null", expected.getMessage());
	}
}
