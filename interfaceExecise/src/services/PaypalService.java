package services;

public class PaypalService implements IOnlinePaymentService{

	
	public double paymentFee(double amount) {
		return amount + (amount * 2/100) ;
	}

	
	public double interest(double amount, int months) {
		return amount + (amount * months/100);
		
	}

}
