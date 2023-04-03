package inheritance;

public class simgleinheritance { //main class
	public static void main(String[] args) {
		SIChild child = new SIChild(); //create a object of class
		
		child.display();
		child.show();
	}
}

class SIParent { //parent class
	void show() { //parent class user define method
		System.out.println("show the details of parent class");		
	}
}

class SIChild extends SIParent { //child class
	void display() { //child class user define method
		System.out.println("display the result of child class");
	}
}