package Array;

public class anonymous {
	static void print(int arr[]) { //static print method receives an array
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		print(new int[]{10,20,30,40,50,60,70,80}); //passing anonymous array to method)
	}	
}
