/**
 * 
 */
package Day4.demo;

import java.util.Scanner;

/*Write a program to accept gender ("Male" or "Female") and age (1-120) from command line arguments and print the percentage of interest based on the given conditions.
Interest == 8.2% 
 Gender ==> Female
 Age    ==>1 to 58
Interest == 7.6% 
 Gender ==> Female
 Age    ==>59 -120
Interest == 9.2% 
 Gender ==> Male
 Age    ==>1-60
Interest == 8.3% 
 Gender ==> Male
 Age    ==>61-120
 */
public class GenderIntrestIFELSE {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a gender");
		String a= sc.next();
		System.out.println("Enter age");
		int b= sc.nextInt();
		if(a=="Female" && (b>0 && b<59))
		{
			System.out.println("Interest is 8.2%");
		}
		else if(a=="Female" && (b>=59 && b<120))
		{
			System.out.println("Interest is 7.6%");
		}
		else if(a=="Male" && (b>=1 && b<60))
		{
			System.out.println("Interest is 9.2%");
		}
		else if(a=="Male" && (b>=60 && b<120))
		{
			System.out.println("Interest is 8.3%");
		}
		//System.out.println("hi");

	}

}
