package Array;

import java.util.Scanner;

public class ArrayEg5_calulation {
	int n;
	int []s=new int[n];
	
public static void main(String[] args) {

	ArrayEg5_calulation obj=new ArrayEg5_calulation();
	Scanner sc=new Scanner(System.in);
	System.out.print("enter size of array");

int n=sc.nextInt();
obj.n=n;
obj.s=new int[obj.n];n=n;

int sum=0, avg=0, multi=1;
for(int i=0;i<obj.n;i++) 
{ 
	obj.s[i] =sc.nextInt();
	sum=sum+obj.s[i];
	multi=multi*obj.s[i];

}	avg=sum/n;

System.out.println(sum); 
System.out.println(avg);
System.out.println(multi);

}
}