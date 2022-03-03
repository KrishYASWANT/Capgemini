package Day19_1;

import java.util.*;

class Player {
	String name;
	int score;

	public Player(String name,int score)
	{
		this.name=name;
		this.score=score;
	}

}
class Checker implements Comparator<Player> {

	  @Override
	  public int compare(Player a1, Player a2) {
	    if (a1.score < a2.score) {
	      return 1;
	    } else if (a1.score > a2.score) {
	      return -1;
	    } else {
	      return a1.name.compareTo(a2.name);
	    }
	  }
	}

public class ChessWithPointsSortComparators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no_of_players = sc.nextInt();
		List<Player> list = new ArrayList<>();
		Player[] p =new Player[no_of_players];
		for(int i=0;i<no_of_players;i++)
		{
			String a=sc.next();
			int b = sc.nextInt();
			p[i]= (new Player(a,b));	
		}
		System.out.println(p);
//		Player p = new Player("hari", 100);
//		Player p1 = new Player("raju", 150);
		 Checker c = new Checker();
		Arrays.sort(p, c);
	    for(int i = 0; i < p.length; i++){
	      System.out.printf("%s %s\n", p[i].name, p[i].score);
	}

	}}
