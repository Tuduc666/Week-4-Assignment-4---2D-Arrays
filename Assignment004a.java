/*
 * 1. Max Value

Create a 2D integer array with 3 rows and 3 columns.
Fill the array with data.

Print out the maximum value in the array.

 * 
 */


public class Assignment004a {

	public static void main(String[] args) {
		int[][] arr = {{23,14,1},
				       {13,44,1},
				       {11,4,14}};
		int max=arr[0][0];
		
		// loop thru the 2D array and store highest integer in max
		for (int[] j : arr)
			for (int i : j) if (i>max) max=i;
		
		System.out.println("Maximum value is " + max);
	}

}
