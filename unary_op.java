// unary operation

class unary_op{
public static void main(String args[]){

int a = 10;
int b = 10;

//System.out.println(a++); // increment by 1 postfix by 1
//System.out.println(++a); // increment by 1 prefix by 1
//System.out.println(a--); // decrement by 1 postfix by 1
//System.out.println(--a); // decrement by 1 prefix by 1 

//System.out.println(a++ + ++b); // 10+11
//System.out.println(++a + a++); // 12+12
//System.out.println(b++ + ++a); // 11+14

System.out.println(a-- + --b); //10+9
System.out.println(--a + a--); //8+8
System.out.println(b-- + --a); //9+6
}
}