package Day4.demo;

import java.util.Scanner;

/*
 * Write a program that takes as input the size of the array and the elements in the array.
 *  The program then asks the user to enter a particular index and prints the element at that index. Index starts from zero.
This program may generate Array Index Out Of Bounds Exception or NumberFormatException . 
Use exception handling mechanisms to handle this exception.

Sample Input and Output 1: Enter the number of elements in the array 2 Enter the elements in the array 50 80 
Enter the index of the array element you want to access 1 The array element at index 1 = 80 The array element successfully accessed

Sample Input and Output 2: Enter the number of elements in the array 2 Enter the elements in the array 50 80 
Enter the index of the array element you want to access 9 java.lang.ArrayIndexOutOfBoundsException

Sample Input and Output 3: Enter the number of elements in the array 2 Enter the elements in the array 30 j java.lang.NumberFormatException
 */
public class ExceptionMultipleCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number");
		//int a= sc.nextInt();
		int array[] = new int[2];
		

		try {
			System.out.println("Enter a elements");
			for(int i=0;i<array.length;i++)
			{
				array[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int a= sc.nextInt();
			System.out.println(array[a]);
		} catch (ArrayIndexOutOfBoundsException r) {
			System.out.println("caused to due to array"+r);
		}catch(NumberFormatException g)
		{
			System.out.println(" "+g);
		}
	}

}
