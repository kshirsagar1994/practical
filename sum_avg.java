package method;

import java.util.*;

public class sum_avg {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a+b+c;
		System.out.println("The Sum:"+sum);
		//sum = sc.nextInt();
				
		float avg = sum/3;
		System.out.println("The Average:"+avg);
		 //avg = sc.nextInt();
	}
}
