
public class Board {
	
	char[][] ships;
	char[][] guesses;
	
	public Board(){
		ships = new char[10][10];
		guesses = new char[10][10];
	}
      
 //method to place the ships at shiprow(sr) and shipcol(s)
 //modify the placeShip method to take in length, startx starty, durectuib 
    public void placeShip (int len, int sr, int sc, boolean vertical) {
		  
	   boolean okplace = true;
	    //checks the length to make sure it fits in the rows and collumns
	   if (len <= 5 && len >= 1 && sr <= 9 && sr >= 0 && sc <= 9 && sc >= 0) { //validate imput
		  if(vertical && (sr + len <= 10)) {
		//it is vertical and it fits
		     for(int i = 0; i < len; i++) {
			     // if there is a s in the rows 
			     if(ships[sr + i][sc] == 's') {
			        System.out.println("You cannot place there is a ship already there");
			        i = len; 
			        okplace = false;
			     }
		      }
		//if okplace then place
		     if (okplace) {  		    
		        for(int j = 0; j < len; j++){
				    ships[sr + j][sc] = 's';
			     }
             }
		  }
		  else {
			//if its not vertical then it must be horziontal 
			if(!vertical && (sc +len <= 10)) {
				
		//it is horziontal and it fits
			   for(int i = 0; i < len; i++) {
				   // if there is a s in the columns it chekcs to see if it then will be ok to place 
				 if(ships[sr][sc + i] == 's') {
					System.out.println("You cannot place there is a ship already there");
					i = len; 
					okplace = false;
				  }
				}
			
				//if okplace then place 
				if (okplace) {
				   for(int j = 0; j < len; j++) {
				      ships[sr][sc + j] = 's';
				    }	

				}		
			}
			else {
				System.out.print("Ship does not fit");
			}
		}
	   } else {
		  //the length is wrong and it will not fit
		  System.out.println("Unvalid inputs");
	}
 
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
