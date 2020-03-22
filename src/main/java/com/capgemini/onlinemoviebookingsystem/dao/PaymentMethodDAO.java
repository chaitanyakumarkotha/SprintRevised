package com.capgemini.onlinemoviebookingsystem.dao;
import java.util.*;

import com.capgemini.onlinemoviebookingsystem.util.PaymentMethodRepository;
public class PaymentMethodDAO {
	public static HashMap<Integer,String> method=new HashMap<Integer,String>();
	PaymentMethodRepository pay=new PaymentMethodRepository();
	public List<String> method()
	{
		return PaymentMethodRepository.method;
	}
	public void methodstored(Integer bookingId,String paymentMethod)
	{
		method.put(bookingId, paymentMethod);
	}
	

}
