
public class Board
{

    public static void main (String[] args) 
     {
	    
	    char[][] board = new char [10][10];
	  
	    board[9][9] = 'X';
	    
	 
	    toString(board);
	 
      }
      
 //method to place the ships at shiprow(sr) and shipcol(s)
      public void placeShip (int sr, int sc) {
		  board[r][c] = 's';
	  }
	  
	  public boolean checkShip (char[][] withShips int r, int c){
		  if (withShips[r][c] == 's'){
			  
			 return true;
			 else{
				 return false;
			}
		}
		
	  
//there are two parameters are row and col which check to see if there is a ship
    public boolean checkShip(int row, int col) {
	
	   if (board[row][col] == 'X') {
          return true;
        } else {
           return false;
		}
   	}

	public void printShips(){
		for(int r - 0; r < 10; r++){
			for(int c = 0; c <10; c++){
				System.out.print(" " + ships[r][c]);
			}//close the column loop
			System.out.print("\n");
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

