/*
 * 3. Tic Tac Toe

Create a 2D character array with 3 rows and 3 columns.
Start by filling the array with spaces.

Create a loop that will do the following:
Ask the user for what row and column they would like to place their mark.
If the spot is currently filled with a space, place their mark.
If it's currently an odd-numbered turn, the mark is X
If it's currently an even-numbered turn, the mark is O
At the end of their turn, print the current board

Continue until all spaces are filled.

 */
import java.util.Scanner;
public class Assignment004c {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
		  
		  char[][] board = {{'-','-','-'},
		                    {'-','-','-'},
		                    {'-','-','-'}};  
		  
		  int turn = 0;    // maximum 9 valid turns to fill the 3X3 board
		  int iRow, iCol;  //user selected row and col
		  boolean invalid;  // invalid entry, retry
		  char symbol;     // X - even. O - odd
		  // infinite loop...  until total of 9 valid moves 
		  do {
			  invalid=false;      // reset flag each time
			  
			  // print the board
			  for(char[] row : board) {
				  for(char col : row)  System.out.print(col);
			  System.out.println();  // new line for each row
			  }
			  // prompt the players
			  if (turn%2==0) {
				  System.out.println("Player1: Make your move, choose an empty space '-'." +
 	                       "  Enter 2 numbers (between 0 and 2) to select a row and a column");
				  symbol = 'X';
			  }

			  else {
				  System.out.println("Player2: Make your move, choose an empty space '-'." +
			               "  Enter 2 numbers (between 0 and 2) to select a row and a column");
				  symbol = 'O';				  
			  }
			  
			  iRow = sc.nextInt();
			  iCol = sc.nextInt();
			  
			  // validate the user's selection
			  if ((iRow<0) || (iRow>2)) {
				  System.out.println("Invalid row, select another");
				  invalid=true;
			  }
			  if ((iCol<0) || (iCol>2)) {
				  System.out.println("Invalid column, select another");
				  invalid=true;
			  }
			  if (!invalid)          // this will prevent array index error
			  if ((board[iRow][iCol]=='X') || (board[iRow][iCol]=='O')) {
				  System.out.println("Location is already filled, select another");
				  invalid=true;
			  }			
			  
			  // entries are valid, update table
			  if (!invalid) {
				  board[iRow][iCol]=symbol;
				  turn++;           // add 1 valid move to the counter
			  }
			  
		  // continue until board is filled
		  } while (turn<9);
		  
		  // display the final result
		  for(char[] row : board) {
			  for(char col : row)  System.out.print(col);
		  System.out.println();  // new line for each row
		  }
		  
		  sc.close();
	}
}