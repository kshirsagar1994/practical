package Staticvar;

class StaticMethod { //class1
	//instance variable 
	int rollno;
	String name;
	float fees;
	static String collage="AGPIT";
	
	//static method to change the value of static variable 
	static void change() { //static method
		collage="SPM";
	}
	
	//parameterized constructor
	
	StaticMethod(int rollno, String name, float fees) {
		this.rollno=rollno;
		this.name=name;
		this.fees=fees;
		
		//user defined method
		void display() {
			System.out.println(rollno+" "+name+" "+fees+" "+collage);
		}
		
		public class StaticMethod { //main class
			public static void main(String[] args) {
				//no need to create object for static method
				//calling static method with class name
				StaticMethod.change();
				
				//creating object
				StaticVar s1=new StaticVar(102,"ram",5000);
				StaticVar s2=new StaticVar(132,"sham",7000);
				
				s1.display();
				s2.display();
			}

		}
	}


}
