package Staticvar;

public class StaticMethodEg2 {
	int m=30; //normal instance variable
	static int n=20; //static variable  
	static int add(int a,int b)
	{ //static method
		return a+b;
	}
	
	public static void main(String[] args) {
		int c=StaticMethodEg2.add(5, 4);
		System.out.println(c);
		//we can not call static variable 
		//inside main without obj because main method is a static
		
		StaticMethodEg2 refvar=new StaticMethodEg2();
		System.out.println(refvar.m);
		System.out.println(n);
	}

}
