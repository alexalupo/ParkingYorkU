package factory;

public class CreditCardPayment implements PaymentOption {

	@Override
	public boolean processPayment() {
		return false;
	}

}
