package Day3.demo;
import java.util.*;

class Bankdetails
{
	//like account type, customer name, account number, balance and number of years to calculate the maintenance charge.
	
	double sysout() 
	{
		Scanner sc= new Scanner(System.in);
		//name of coustomer
		System.out.println("enter your Name");
		String name=sc.next();
		System.out.println("Customer Name "+ name);
		
		//acount no
		System.out.println("enter your Account number");
		long accno=sc.nextLong();
		System.out.println("Account number is "+ accno);
		
		// balance 
		System.out.println("enter your Balance");
		long bal=sc.nextLong();
		System.out.println("Account number is "+ bal);
		//number of years
		System.out.println("Enter the number of years");
		double years=sc.nextDouble();
		//System.out.println("years  "+ years);
		return years;
	}
	
}
 class calculateMaintenanceCharge
{
		double CurrentAccount(double n1) {
			double m=100;
			//double n11= noOfYears;
			double MaintenanceCharge = (m * n1) + 200;
			return MaintenanceCharge;
		}
		double SavingsAccount(double n) {
			double m=50;
			//double n= noOfYears;
			double MaintenanceCharge = (m * n) + 50;
			return MaintenanceCharge;
		}
}
public class KgfbBankaccount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("1. Savings Account");
	    System.out.println("2. Current Account");
	    System.out.println("Enter your choice: 1 or 2 ");
	    int choice=sc.nextInt();
		switch(choice )
		{
		case 1:

		    System.out.println("1");
		    Bankdetails bd= new Bankdetails();
			double no=bd.sysout();
			calculateMaintenanceCharge cm= new calculateMaintenanceCharge();
			System.out.println("Maintenance Charge for Current Account is "+cm.SavingsAccount(no) ); 
		    break;
		case 2:
			
		    System.out.println("2");
		    Bankdetails bd2= new Bankdetails();
			double no1=bd2.sysout();
			calculateMaintenanceCharge cm1= new calculateMaintenanceCharge();
			System.out.println("Maintenance Charge for Current Account is "+cm1.CurrentAccount(no1)); 
		    break;
		    
		 default:
			System.out.println("plz choose correctly");
			break;
		}

	}

}
