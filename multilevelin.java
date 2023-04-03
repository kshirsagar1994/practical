package inheritance;
//multilevel inheritance 
class vehicle {//parent class A
	void running() {
		System.out.println("running mode on");
	}
}

class car extends vehicle { // child class B whose parent class is vehicle 
	void run() {
		System.out.println("car run mode on");
	}
}

class mustang extends car { // child class c whose parent class is vehicle
	void speed() {
		System.out.println("speed is very high");
	}
}

public class multilevelin {
	public static void main(String[] args) {
		mustang d = new mustang(); //creating obj
		d.running();
		d.run();
		d.speed();
	}
}