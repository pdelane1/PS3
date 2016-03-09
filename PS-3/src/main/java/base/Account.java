package base;
import java.util.Date;
import java.util.Scanner;

	public class Account {

		private int iD;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated;
		
		/**
		 * 
		 */
		public Account() {
			super();
		}

		/**
		 * @param iD
		 * @param balance
		 */
		public Account(int iD, double balance) {
			super();
			this.iD = iD;
			this.balance = balance;
		}

		/**
		 * @return the iD
		 */
		public int getiD() {
			return iD;
		}

		/**
		 * @param iD the iD to set
		 */
		public void setiD(int iD) {
			this.iD = iD;
		}

		/**
		 * @return the balance
		 */
		public double getBalance() {
			return balance;
		}

		/**
		 * @param balance the balance to set
		 */
		public void setBalance(double balance) {
			this.balance = balance;
		}

		/**
		 * @return the annualInterestRate
		 */
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		/**
		 * @param annualInterestRate the annualInterestRate to set
		 */
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}

		public static double getMonthlyInterestRate(double annualInterestRate){
			double monthlyInterestRate = annualInterestRate/12;
			return monthlyInterestRate;
		}
		
		public void withdraw(double withdrawAmount){
			balance = balance - withdrawAmount;
			try{
				if(balance < 0){
					throw new InsufficientFundsException(balance);
				}
			}
			catch(InsufficientFundsException overdrawn){
				balance = balance + withdrawAmount;
			}
		}
		
		public void deposit(double depositAmount){
			balance = balance + depositAmount;
		}
}
