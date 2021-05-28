package org.emp;

public class Bank extends Hdfc_Bank {


	public void personalLoan() {
		System.out.println("personal loan is 10% ");		
			}
		public static void main(String[] args) {
			Bank b = new Bank();
			b.bikeLoan();
			b.marriageLoan();
			b.personalLoan();
		}
		}
