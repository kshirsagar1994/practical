package method;

public class user_defined {
	
	public int add (int a, int b)
	{
		return a+b;
		
	}

	public static void main(String[] args) {
		user_defined obj = new user_defined();
		System.out.println(obj.add(15,12));
	}
}
