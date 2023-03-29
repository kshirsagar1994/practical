
//we are creating any constructor so compiler provide us default constructor.
// "0" and "null" default value provided by default constructor.

package constructor;

public class def_consEg2 {
	int s1_no;
	String name;
	void reult() {
		System.out.println(s1_no+""+name);
		
	}
	public static void main(String[] args) {
		def_consEg2 obj = new  def_consEg2();
		
		System.out.println(obj.s1_no+" "+obj.name);
	}

}
