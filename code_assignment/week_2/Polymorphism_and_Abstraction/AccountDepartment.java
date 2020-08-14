package com.its20.oop.demo;

public class AccountDepartment {
	private long id;
	private String companyName;
	private String departmentName;
	private int numberOfEmployee;
	private double capitalAmount;
	private double craditAmount;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	public double getCapitalAmount() {
		return capitalAmount;
	}

	public void setCapitalAmount(double capitalAmount) {
		this.capitalAmount = capitalAmount;
	}

	public double getCraditAmount() {
		return craditAmount;
	}

	public void setCraditAmount(double craditAmount) {
		this.craditAmount = craditAmount;
	}

	public void work() {
		System.out.println("Account Work....");
	}

	public void call(String message) {
		System.out.println("Account Comming.... : " + message);
		System.out.println("Reports : " + this.capitalAmount + " : " + this.craditAmount);
	}

	public boolean isMoreInvestmentOK() {
		if ((this.capitalAmount * 2) < this.craditAmount)
			return true;
		else
			return false;
	}
}
