package services;

public interface IOnlinePaymentService {
	public double paymentFee(double amount);
	public double interest(double amount,int months);
}
