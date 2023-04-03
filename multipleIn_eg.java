//multiple level inheritance (two parent, single child)

package inheritance;

public class multipleIn_eg {//main class
		public static void main(String[] args) {
			child1 obj = new child1(); //create a object of class
			obj.run();
			}
	}

	class Parent1 { //parent class
		void run() { //parent class user define method
			System.out.println("parent1 run method");		
		}
	}

	class Parent2 { //parent class
		void run() { //parent class user define method
			System.out.println("parent2 run method");		
		}
	}
	
	class child1 extends Parent1,Parent2 { //child class

}
