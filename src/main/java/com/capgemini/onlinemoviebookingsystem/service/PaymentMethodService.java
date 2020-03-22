package com.capgemini.onlinemoviebookingsystem.service;
import java.util.*;
import com.capgemini.onlinemoviebookingsystem.dao.PaymentMethodDAO;

public class PaymentMethodService {
	PaymentMethodDAO dao=new PaymentMethodDAO();
	public String choosePaymentMethod()
	{
		Scanner sc=new Scanner(System.in);
		List<String > methods=dao.method();
		for(int i=0;i<methods.size();i++)
		System.out.println((i+1)+" "+methods.get(i));
		System.out.println("Select the payment method");
		int name=sc.nextInt();
		return methods.get(name-1);
	}

}
