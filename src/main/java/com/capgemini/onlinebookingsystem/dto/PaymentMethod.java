package com.capgemini.onlinebookingsystem.dto;

public class PaymentMethod {
	String Paytm;
	String GooglePay;
	String DebitCard;
	String CreditCard;
	public String getPaytm() {
		return Paytm;
	}
	public void setPaytm(String paytm) {
		Paytm = paytm;
	}
	public String getGooglePay() {
		return GooglePay;
	}
	public void setGooglePay(String googlePay) {
		GooglePay = googlePay;
	}
	public String getDebitCard() {
		return DebitCard;
	}
	public void setDebitCard(String debitCard) {
		DebitCard = debitCard;
	}
	public String getCreditCard() {
		return CreditCard;
	}
	public void setCreditCard(String creditCard) {
		CreditCard = creditCard;
	}

}
