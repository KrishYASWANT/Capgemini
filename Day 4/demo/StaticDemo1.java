package Day4.demo;


class Strange
{
	int len=10;
	static int side=5;
	static void hi(int side1)
	{
		System.out.println("area of hi is "+ side1*side);
	}
}
public class StaticDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strange s= new Strange();
		//Strange a1=null;
		s.hi(25);

	}

}
