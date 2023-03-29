package Access_Modifire;

class Test{
	private int a=10;
	//private void display() 
	void display()
	{
		System.out.println("Privte method");
	}
}
public class private_acess_mod {
	public static void display() {
		Test obj = new Test();
		System.out.println("obj.a");
		obj.display();
		
	}
	
}
