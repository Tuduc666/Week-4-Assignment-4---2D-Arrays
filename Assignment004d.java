/*
 * Create a 2D character array with 5 rows and 5 columns
To start, fill every position with an O.
Then, fill the [0][0] position with an X.
This X represents the user's "avatar".

Create a loop which does the following:
-Starts by printing the array
-Asks the user for what direction they would like to go
-Waits for user input
-Moves the avatar in that direction, if it exists (ie: up=row-1, right=column+1)
-If it does not exist, tell the user and exit the program
-Fill the avatar's new position with an X
-Fill the avatar's old position with an O

 */
import java.util.Scanner;
public class Assignment004d {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
		  
		  char[][] board = {{'O','O','O','O','O'},
							{'O','O','O','O','O'},
							{'O','O','O','O','O'},
							{'O','O','O','O','O'},
							{'O','O','O','O','O'}};  
		  
		  int cRow, cCol, savLoc;  // current position
		  boolean invalid=false;  // invalid move
		  String input;
		  		  		  
		  // initialization
		  cRow = 0;
		  cCol = 0;
		  board[cRow][cCol]='X';
		  
		  // infinite loop... until user makes an invalid move
		  do {
			  		  
			  // print the board
			  for(char[] row : board) {
				  for(char col : row)  System.out.print(col);
			  System.out.println();  // new line for each row
			  }
			  // prompt the players
			  System.out.println("What direction would you like to go (up, down, right, left)?");
 	          			  
			  input = sc.nextLine();

		      // Switch statement
			  switch (input) {
			  case "left":{
				  savLoc = cCol;
				  cCol--;				  
				  // validate the user's selection
				  if ((cCol<0) || (cCol>4)) {
					  System.out.println("Error: You cannot move there from your current position");
					  System.out.println("Exiting program...");
					  invalid=true;
				  }
				  // update
				  if(!invalid) {
					  board[cRow][savLoc]='O';     // old location to O

					  board[cRow][cCol]='X';     // new location to X 
				  }
			  }
			  break;
			  case "right":{
				  savLoc = cCol;
				  cCol++;				  
				  // validate the user's selection
				  if ((cCol<0) || (cCol>4)) {
					  System.out.println("Error: You cannot move there from your current position");
					  System.out.println("Exiting program...");
					  invalid=true;
				  }
				  // update
				  if(!invalid) {
					  board[cRow][savLoc]='O';     // old location to O

					  board[cRow][cCol]='X';     // new location to X 
				  }
			  }
			   break;
			  case "up":{
				  savLoc = cRow;
				  cRow--;				  
				  // validate the user's selection
				  if ((cRow<0) || (cRow>4)) {
					  System.out.println("Error: You cannot move there from your current position");
					  System.out.println("Exiting program...");
					  invalid=true;
				  }
				  // update
				  if(!invalid) {
					  board[savLoc][cCol]='O';     // old location to O

					  board[cRow][cCol]='X';     // new location to X 
				  }
			  }
			   break;
			  case "down":{
				  savLoc = cRow;
				  cRow++;				  
				  // validate the user's selection
				  if ((cRow<0) || (cRow>4)) {
					  System.out.println("Error: You cannot move there from your current position");
					  System.out.println("Exiting program...");
					  invalid=true;
				  }
				  // update
				  if(!invalid) {
					  board[savLoc][cCol]='O';     // old location to O

					  board[cRow][cCol]='X';     // new location to X 
				  }
			  }
			   break;
			  default:
			   System.out.println("Invalid entry, try again");
			    break;
			  }
		  		  
		  // continue until user makes an invalid move
		  } while (!invalid);
		  	  
		  sc.close();
	}
}