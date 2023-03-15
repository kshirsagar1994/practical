// Coder: AK


class datatype{
	//public static void main(String args[]) {
	
	int a;
	short b;
	char c;
	long d;
	double e;
	float f;	
	
	void show() 
	{
	System.out.println("int"+a);
	System.out.println("short"+b);
	System.out.println("char"+c);
	System.out.println("long"+d);
	System.out.println("double"+e);
	System.out.println("float"+f);
	}

	public static void main(String args[]) 
	{
	datatype object=new datatype();
	System.out.println("the default value of datatype:");
	object.show();
	}

}