/*
 * 2. Sum of a column

Create a 2D integer array with 3 rows and 3 columns.
Fill the array with random data.

Ask the user which column they would like to get the sum of.
Get the total of all values in that column.

For instance, if the user chose column 1:
array[0][1] + array[1][1] + array[2][1]

 */
import java.util.Scanner;
public class Assignment004b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = {{23,14,1},
				       {13,44,1},
				       {11,4,14}};
		int sum=0;
		
		// prompt user
		System.out.println("Sum of 3X3 array.  Which column would"
				+ " you like to sum?  Enter a number between 0 and 2. ");
		int input = sc.nextInt();
		
		if ((input<0) || (input>2)) System.out.println("Invalid entry");
		else {
			// loop thru the 2D array and sum up the specified column 
			for (int i=0; i<arr.length;i++) sum += arr[i][input];
						
			System.out.println("The sum of column " + input + 
					" is " + sum);
		}
		sc.close();
		
	}

}
