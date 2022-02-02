package Day4.demo;


interface play
{
	void Football();
	void Cricket();
	void Basketball();
	
	
}

class Krish implements play
{

	@Override
	public void Football() {
		System.out.println("yes i do play football");
		
	}

	@Override
	public void Cricket() {
		System.out.println("yes i do play Cricket");
		
	}

	@Override
	public void Basketball() {
		// TODO Auto-generated method stub
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Krish p= new Krish();
		p.Football();
	}

}
