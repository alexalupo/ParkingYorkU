package factory;

public class PayPalPayment implements PaymentOption {

	@Override
	public boolean processPayment() {
		return false;
	}

}
