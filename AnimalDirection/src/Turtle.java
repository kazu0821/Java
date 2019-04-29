import java.util.Random;

public class Turtle implements Critter{
	
	
	private int direction = 1;
	

	public int getMove(CritterInfo info){
		

		if (direction == EAST){//turtle way is just four ways. So if direction is EAST, it will change SOUTH
			direction = SOUTH;//
			return SOUTH; 
		}
		else if (direction == SOUTH){
			direction = WEST;
			return WEST; 		//changed to SOUTH to West		

		}
		else if (direction == WEST){
			direction = NORTH;//changed to west to north
			return NORTH;				
		}
		else if (direction == NORTH){
			direction = EAST;//changed to north to east
			return EAST;      
		}
		return NORTH;
		

		
		
		
		
		
  }

	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 'T';
	}
}
