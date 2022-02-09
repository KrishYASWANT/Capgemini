package Day9.demo;
import java.io.*;
import java.util.Scanner;


/*
 * 1

File : Count Character Write a program to count the number of times a character appears in the File. 
(Case insensitive... 'a' and 'A' are considered to be the same)

Sample Output: Enter the file name Input.txt Enter the character to be counted r File 'Input.txt'
 has 99 instances of letter 'r'.
 */

public class CountCharacter {

	public static void main(String[] args) throws IOException {
		
		FileInputStream a = new FileInputStream("C:\\Users\\pc\\Desktop\\TRY JAVA.txt");
		InputStreamReader  read = new InputStreamReader(a);
		BufferedReader buffer = new BufferedReader(read);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the char u want to find");
		char ch= sc.next().charAt(0);
		String line;
		int count = 0;
		while((line = buffer.readLine())!=null)
		{
			if(line.equals('i'))
			{
				count++;
			}
			System.out.println(line.length());
		}
		
		System.out.println("the char is repeated "+ count + " Times");

		
	}

}
