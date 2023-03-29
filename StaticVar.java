package Staticvar;
//static variable used to refer to the common property for all the object.

public class StaticVar {
	
	int rollno;
	String name;
	float fees;
	static String collage="SPM";
	
	//Constructor
	StaticVar(int rollno, String name, float fees) {
		this.rollno=rollno;
		this.name=name;
		this.fees=fees;
	}
	
	//method
	void display() {
		System.out.println(rollno+" "+name+" "+fees+" "+collage);
	}
	
	public class StaticVar1 { //class2
	public static void main(String[] args) {
		//object
		StaticVar a1=new StaticVar(102,"ram",5000);
		StaticVar a2=new StaticVar(132,"sham",3000);
		
		s1.display();
		s2.display();
		
	}
}
}
