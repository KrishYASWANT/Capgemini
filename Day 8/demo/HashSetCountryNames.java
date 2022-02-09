package Day8.demo;
import java.util.*;
/*
Develop a java class with a instance variable Country HashSet (H1) add a method saveCountryNames(String CountryName), 
the method should add the passed country to a HashSet (H1) and return the added HashSet(H1). 
Develop a method getCountry(String CountryName) 
which iterates through the HashSet and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.
 */
class Country
{
	void SaveCountryNames()
	{
		HashSet<String> a = new HashSet<String>();
		
		a.add("India");
		a.add("Australia");
		a.add("South Africa");
		System.out.println(a);
        System.out.println("List contains India or not:"
                           + a.contains("India"));
 
        // Removing items from HashSet
        // using remove() method
        a.remove("Australia");
        System.out.println("List after removing Australia:"
                           + a);
 
        // Display message
        System.out.println("Iterating over list:");
 
        // Iterating over hashSet items
        Iterator<String> i = a.iterator();
 
        // Holds true till there is single element remaining
        while (i.hasNext())
 
            // Iterating over elements
            // using next() method
            System.out.println(i.next());
		
	}
}

public class HashSetCountryNames {
	
	public static void main(String[] args) 
	{
		
		Country c= new Country();
		c.SaveCountryNames();
		

	}

}
