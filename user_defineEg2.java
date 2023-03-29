package method;
import java.util.Scanner;

public class user_defineEg2 {
	public static void positive_or_not(int number) {
		if(number>0) {
			System.out.println("The positive number");

		}
		else
		{
			System.out.println("The negative number");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		positive_or_not(number);
	}
}
