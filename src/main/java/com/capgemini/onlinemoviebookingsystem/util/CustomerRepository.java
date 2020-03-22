package com.capgemini.onlinemoviebookingsystem.util;
import java.util.*;

import com.capgemini.onlinebookingsystem.dto.Customer;
public class CustomerRepository {
	public static List<Customer>customerDetails=new ArrayList<Customer>();  
	static {
		customerDetails.add(new Customer(123456,"Rama"));
	}

}
