package inheritance;

class Parents_IS_A_inheritance{
	int marks = 85;
}

class IS_A_inheritance extends Parents_IS_A_inheritance  {
	
	int additional_percentage = 5;
	public static void main(String[] args) {
		IS_A_inheritance obj = new IS_A_inheritance();
		System.out.println("total marks:"+(obj.marks+obj.additional_percentage));
	}

}
