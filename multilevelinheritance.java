package inheritance;

public class multilevelinheritance {
	//main class
	public static void main(String[] args) {
		SIChild2 child=new SIChild2();
		
		child.show();
		child.display();
		child.print();
	}
}

class SIParent1 { //parent class
	void show() { 
		System.out.println("show the details of parent class");
	}
}

class SIChild1 extends SIParent1 {
	void display() {
		System.out.println("display the result of child class 1");
	}
}


class SIChild2 extends SIChild1 {
	void print() {
		System.out.println("print the output of child class 2");
	}

}	