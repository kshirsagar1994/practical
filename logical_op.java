// logical operation

class logical_op{
public static void main(String args[]){

int a = 10;
int b = 5;
int c = 20;

System.out.println(a>b && a<c); //t 
System.out.println(a==b || b>c); //f
System.out.println(a>c && b<a); //f
System.out.println(a<c || b>a); //t

}
}