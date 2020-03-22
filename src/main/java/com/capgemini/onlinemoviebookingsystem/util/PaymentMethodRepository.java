package com.capgemini.onlinemoviebookingsystem.util;
import java.util.*;

import com.capgemini.onlinebookingsystem.dto.PaymentMethod;
public class PaymentMethodRepository {
public static List<String> method=new ArrayList<String>();
PaymentMethod paymethod=new PaymentMethod();
public PaymentMethodRepository()
{
	/*paymethod.setCreditCard("SBI creditcard");
	paymethod.setDebitCard("CITI bank");
	paymethod.setGooglePay("1234@hdfcupi.com");
	paymethod.setPaytm("876@paytmupi.com");*/
	
	paymethod.setCreditCard(" creditcard");
	paymethod.setDebitCard("Debit bank");
	paymethod.setGooglePay("GooglePay");
	paymethod.setPaytm("Paytm");
	
	method.add(paymethod.getPaytm());
	method.add(paymethod.getCreditCard());
	method.add(paymethod.getDebitCard());
	method.add(paymethod.getGooglePay());
}

}
