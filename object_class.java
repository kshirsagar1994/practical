package com;

public class object_class {
	// instance variable/ field
	int s1_no=1;
	String name="ak";
	
	public static void main(String[] args) {
		//creating the object
		object_class obj = new object_class();
		//accessing field with the help ref variable(obj)
		System.out.println(obj.s1_no);//print the value of obj
		System.out.println(obj.name);
		
	}
	
	

}
