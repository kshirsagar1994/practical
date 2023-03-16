// unary operation

class unary_op{
public static void main(String args[]){

int a = 10;
int b = 10;

System.out.println(a++); // increment by 1 postfix by 1
System.out.println(++a); // increment by 1 prefix by 1
System.out.println(a--); // decrement by 1 postfix by 1
System.out.println(--a); // decrement by 1 prefix by 1 

System.out.println(a++ + ++b);
System.out.println(++a + a++);
System.out.println(b++ + ++a);

}
}