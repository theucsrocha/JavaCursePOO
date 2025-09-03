package entites;

import java.util.ArrayList;

import agregation_exercise.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private ArrayList<HourContract> contracts;
	private Double income;
	public Worker(String name, WorkerLevel level, Double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.contracts = new ArrayList<HourContract>();

	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public ArrayList<HourContract> getContracts() {
		return contracts;
	}

	public void setContracts(ArrayList<HourContract> contracts) {
		this.contracts = contracts;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(int year,int month) {
		income = 0.0;
		for(HourContract c : contracts) {
			if(c.getDate().getYear() == year && c.getDate().getMonthValue() == month) {
				income+= c.totalValue();
			}
		}
		return income + baseSalary;
	}

}
