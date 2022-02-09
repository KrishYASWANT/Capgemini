package Day8.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*
 * # Batting Average

National Cricket Academy (NCA) wants to monitor the performance of the players registered with them
 based on the average runs scored in the matches played. 

As a software consultant of NCA, help them by writing a java program to meet their requirements.  

The application needs to store the runs scored by a player and calculate the average score.

### Component Specification: Player Class

| Type(Class) | Attributes | Methods | Responsibilities |
| ----------- | ---------- | ------- | ---------------- |
| Player | List<Integer> scoreList | Include the getter and setter methods for the attribute. |
 

## Requirement 1:  Store the runs scored by a player

Whenever a match is over, NCA needs to store the runs scored by the players for future reference.

The addScoreDetails method accepts runScored as argument and adds it to the scoreList.

### Component Specification: Player Class

| Component Name | Type(Class) | Methods | Responsibilities |
| -------------- | ----------- | ------- | -------
 */
class player
{
	void Scorelist()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of matches played ");
		int n= sc.nextInt();
		System.out.println("Enter the score of the player  ");
		//int a[] = new int[n];
		for(int i =0 ;i<n;i++)
		{
			//System.out.println("Enter the score of match " + i);
			list.add(sc.nextInt());
		}
		
		
		System.out.println(list);
		
		
		
	}
}
public class BattingAverage {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		player p = new player();
		p.Scorelist();

	}

}
