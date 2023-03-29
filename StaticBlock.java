// imp for interview
//jdk 1.6 it is possible that without main we can execute static block 
//jdk 1.7 onward it is not possible to execute a java code without main

package Staticvar;
public class StaticBlock {
	static {
		System.out.println("Static block executed");
	}
	
	public static void main(String[] args) {
		System.out.println("main method executed");
	}

}
