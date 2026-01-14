package factory;

public class DebitCardPayment implements PaymentOption {

	@Override
	public boolean processPayment() {
		return false;
	}

}
