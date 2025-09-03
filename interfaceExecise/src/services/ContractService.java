package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private IOnlinePaymentService onlinePaymentService;

	public ContractService(IOnlinePaymentService onlinePaymentService) {
	
		this.onlinePaymentService = onlinePaymentService;
	}

	public IOnlinePaymentService getOnlinePaymentService() {
		return onlinePaymentService;
	}

	public void setOnlinePaymentService(IOnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract,int months) {
		double basicQuota = contract.getTotalValue() / months;
		for(int i = 1;i < months;i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			Double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(interest);
			contract.getInstallments().add(new Installment(dueDate,fee));
			
		}
	}
	
	
}
