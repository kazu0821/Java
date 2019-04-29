import java.util.Random;

public class Mouse implements Critter {// this is M

	
	public boolean northwest;
	
		
	
	
	public int getMove(CritterInfo info){
		
		// This is representing that if Mouse wants to go north, mouse will go north
		if (northwest == true){
			
			return NORTH; //north
		}
		
		// if the the way is oppsite, the way will got to west.
		else if (northwest == false){
			
			return WEST;  
		}
		return NORTH;
		
		
		
		
		
		
  }

	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 'M'; // character is M
	}
}
