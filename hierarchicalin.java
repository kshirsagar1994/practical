package inheritance;

class OperartingSytem {//parent class A
	void Boost() {
		System.out.println("Boost mode on");
	}
}

class Windows extends OperartingSytem { // child class B whose parent class is vehicle 
	void run() {
		System.out.println("run mode on");
	}
}

class Linux extends OperartingSytem { // child class c whose parent class is vehicle
	void storage_capacity() {
		System.out.println("storage_capacity is very high");
	}
}

public class hierarchicalin{
	public static void main(String[] args) {
		Linux b = new Linux(); //creating obj
		b.Boost();
		b.storage_capacity();
		Windows c = new Windows();
		c.run();
		c.Boost();
	}
}