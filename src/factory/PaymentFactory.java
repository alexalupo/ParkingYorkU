package factory;

public class PaymentFactory {
	public static PaymentOption createPayment(String type) throws IllegalArgumentException, NullPointerException {
		if (type == null) {
			throw new NullPointerException("Payment Type cannot be NULL");
		}
		
		switch(type) {
		case "paypal":
			return new PayPalPayment();
		case "credit":
			return new CreditCardPayment();
		case "debit":
			return new DebitCardPayment();
		}
		throw new IllegalArgumentException("Choose either paypal, credit, or debit");
	}
}
