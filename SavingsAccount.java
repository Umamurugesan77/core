
public class SavingsAccount {
		public static double annualIN;
		private double savingBal;


		      public SavingsAccount(int a) {
		    	this.savingBal= a;
		      }

		public void  CalculateIN() {
			double intrest = (savingBal*(annualIN/100.0))/12;
			savingBal = savingBal+intrest;
		}

		public static void  modifyRate(double newvalue) {
			annualIN = newvalue;
		}
		 public void  showbal() {
			 System.out.println("Your balance : "+ savingBal);
			 
		 }



		public static void main(String[] args) {
			double annaulIN=2000.0;
			double savingBal=300;
			SavingsAccount saver1=new SavingsAccount(2000);
			SavingsAccount saver2= new SavingsAccount(3000);
			SavingsAccount.modifyRate(4);
			saver1.showbal();
			saver2.showbal();
			saver1.CalculateIN();
			saver2.CalculateIN();
			saver1.showbal();
			saver2.showbal();
			SavingsAccount.modifyRate(5);
			saver1.showbal();
			saver2.showbal();
			saver1.CalculateIN();
			saver2.CalculateIN();
			saver1.showbal();
			saver2.showbal();
		}
	}

