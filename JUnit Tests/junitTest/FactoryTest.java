package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import factory.*;

class FactoryTest {

	@Test
	public void payWithCard() {
		PaymentOption paypal = PaymentFactory.createPayment("paypal");
		PaymentOption credit = PaymentFactory.createPayment("credit");
		PaymentOption debit = PaymentFactory.createPayment("debit");
		
		assertTrue(paypal instanceof PayPalPayment);
		assertTrue(credit instanceof CreditCardPayment);
		assertTrue(debit instanceof DebitCardPayment);
	}
	
	@Test
	public void payWithYorkCard() {
		assertThrows(IllegalArgumentException.class, () -> {
			PaymentFactory.createPayment("YorkU");
		});
	}
	
	@Test
	public void payWithNullValue() {
		assertThrows(NullPointerException.class, () -> {
			PaymentFactory.createPayment(null);
		});
	}
	
	@Test
	public void payWithEmptyString() {
		assertThrows(IllegalArgumentException.class, () -> {
			PaymentFactory.createPayment("");
		});
	}
	
}
