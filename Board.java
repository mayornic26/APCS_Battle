
	public class Board {
	
	char[][] ships;
	char[][] guesses;
	
	public Board(){
		ships = new char[10][10];
		guesses = new char[10][10];
	}
      
 //method to place the ships at shiprow(sr) and shipcol(s)
 //modify the placeShip method to take in length, startx starty, durectuib 
      public void placeShip (int len, int sr, int sc, int boolean vertical) {
		  
		 
		  
		  
		  
		  
		  ships[sr][sc] = 's';
	  }
	  
	  public boolean checkShip (char[][] withShips, int r, int c){
		  if (ships[r][c] == 's'){
				return true;
			}
			 else {
				 return false;
			}
	}
	
    public void printShips(){
	   for(int r = 0; r < 10; r++){
		 for(int c = 0; c < 10; c++){
			System.out.print("," + 0+(ships[r][c]) );
		  }
	    System.out.println("\n");
	   }
     }
}
