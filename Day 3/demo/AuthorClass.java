package Day3.demo;
import java.util.*;

/*
 * CCreate a class called Author is designed as follows:

It contains:
• Three private instance variables: name (String), email (String), and gender (char of either ‘m’ or ‘f’).
• One constructor to initialize the name, email and gender with the given values.

And, a class called Book is designed as follows:
It contains:
• Four private instance variables: name (String), author (of the class Author you have just created),
 price (double), and qtyInStock (int). Assuming that each book is written by one author.
• One constructor which constructs an instance with the values given.
• Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock().
 Again there is no setter for name and author.
Write the class Book (which uses the Author class written earlier). 
Try:
1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
2. After obtaining the “Author” object, print the Author (name, email & gender) of the book.
 */
class Author
{
	private String name;
	private String email;
	private char gender;
	
	Author()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of Author");
		String name=sc.nextLine();
		System.out.println("Enter the email");
		String email=sc.nextLine();
		System.out.println("Enter the gender");
		char gender=sc.next().charAt(0);
		
	}
}
class Book
{
	private String name;
	private String Autho;
	private double price;
	private int qtyInStock;
	
	//Book()
	/*{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of book");
		String name=sc.nextLine();
		System.out.println("Enter the price of book");
		double price=sc.nextDouble();
		System.out.println("Enter the number of book available");
		int qtyInStock=sc.nextInt();
	}*/

	public String getName() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name of book");
		String name=sc.nextLine();
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutho() {
		return Autho;
	}

	public void setAutho(String autho) {
		Autho = autho;
	}

	public double getPrice() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the price of book");
		this.price=sc.nextDouble();
		return price;
	}

	public void setPrice(double price) {
		
		//this.price = price;
	}

	public int getQtyInStock() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of book available");
		this.qtyInStock=sc.nextInt();
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		
		//this.qtyInStock = qtyInStock;
	}
}

public class AuthorClass {

	public static void main(String[] args) {
		
		Book b=new Book();
		b.getAutho();
		b.getName();
		b.getPrice();
		b.getQtyInStock();
		Author a= new Author();

	}

}
