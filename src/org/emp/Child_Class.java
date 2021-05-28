package org.emp;

public class Child_Class implements Loan {

	@Override
	public void homeLoan() {
		System.out.println("home loan is 5%");
		
	}

	@Override
	public void marriageLoan() {
		System.out.println("marriage loan is 4% ");
		
	}
public static void main(String[] args) {
	Child_Class cc = new Child_Class();
	cc.homeLoan();
	cc.marriageLoan();
}
}
