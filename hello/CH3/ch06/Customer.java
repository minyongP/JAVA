package ch06;

public class Customer {

	protected int customerID; // �ܺ� Ŭ������ ���� �� �� ������ ���� Ŭ������ ���� �� �� �ֵ��� private�� �ƴ� protected
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

//	String agentID;
//	double saleRatio;

	/*
	 * public Customer() { customerGrade = "SIVER";
	 * bonusRatio = 0.01;
	 * 
	 * System.out.println("Customer() call");
	 * 
	 * }
	 */

	public Customer(int customerId, String customerName) {
		this.customerID = customerId;
		this.customerName = customerName;
		
		customerGrade = "SIVER";
		bonusRatio = 0.01;
		
	
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
}
