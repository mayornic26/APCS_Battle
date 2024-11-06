
public class Board
{

    public static void main (String[] args) 
     {
	    
	    char[][] board = new char [10][10];
	  
	    board[9][9] = 'X';
	    
	 
	    toString(board);
	 
      }
//there are two parameters are row and col which check to see if there is a ship
    public boolean checkShip(int row, int col) {
	
	   if (board[row][col] == 'X') {
          return true;
        } else {
           return false;
		}
   	}

//The method is toString which takes a 2D array fillBoard as a parameter 
//This will print the rows and columns of the board 10 x10
    public void toString (char fillBoard[][]){
	   for(int r = 0; r < 10; r++){
		 for(int c = 0; c < 10; c++){
			System.out.print(fillBoard[r][c] + " ");
		  }
	    System.out.println();
	   }
     }
}


