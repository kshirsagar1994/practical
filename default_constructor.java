package constructor;
 
class default_constructor { //default constructor 
	default_constructor(){
	System.out.println("Default constructor called..");
}

public static void main(String[] args) {
	//constructor called at this time of obj creation
	default_constructor obj = new default_constructor();
}
}
