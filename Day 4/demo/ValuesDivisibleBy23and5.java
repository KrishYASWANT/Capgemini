package Day4.demo;

public class ValuesDivisibleBy23and5 {

	public static void main(String[] args) {
		int num=0;
		for(int i=5;i<10000;i++)
		{
			if((i%5==0)&& (i%2==0)&&(i%3==0))
			{
				System.out.println(i);
				num++;
			}
			if(num==5)
				break;
		}

	}

}
