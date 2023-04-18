package Array;

public class EvenOdd_Homework {
	
		   public static void main(String[] args) {
			   
		      int[] no = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

		      System.out.println("The Even numbers:");
		      for(int i = 0; i < no.length; i++) {
		         if(no[i] % 2 == 0) {
		            System.out.println(no[i]);
		         }
		      }

		      System.out.println("The Odd numbers:");
		      for(int i = 0; i < no.length; i++) {
		         if(no[i] % 2 != 0) {
		            System.out.println(no[i]);
		         }
		         
		      }
		   }
		}
