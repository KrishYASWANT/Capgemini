package Day4.demo;

public class CommandLineArgs {

	public static void main(String[] args) {
		int a=args.length;
		if(a==2)
		{
			System.out.println("No value");
		}
		else
		/*{
			for(String i :args)
				System.out.println(i+",");
		}*/
		{
			
				System.out.print(args[2]);
				for(int i=3;i<a;i++)
			{
				System.out.print(","+args[i]);
			}
		}

	}

}
