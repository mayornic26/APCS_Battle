
public class Board {
	
	char[][] ships;
	
	public Board(){
		ships = new char[10][10];
}
      
 //method to place the ships at shiprow(sr) and shipcol(s)
      public void placeShip (int sr, int sc) {
		  board[sr][sc] = 's';
	  }
	  
	  public boolean checkShip (char[][] withShips int r, int c){
		  if (withShips[r][c] == 's'){
			  
			 return true;
			 else{
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

