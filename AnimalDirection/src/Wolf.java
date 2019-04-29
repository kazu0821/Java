import java.util.Random;

public class Wolf implements Critter{


	public int getMove(CritterInfo info){
	
		Random rand = new Random();
		int direction = rand.nextInt(4)+ 1;// I hold random.But I changed the way
		

		if (direction == 1){
			direction = -1;
			return NORTH; //north
		}
		else if (direction == 2){
			direction = 3;
			return NORTH; 				//south 

		}
		else if (direction == 3){
			direction = 8;
			return SOUTH;//east
		}
		else if (direction == 4){
			direction = 11;
			return EAST;           //
		}
		else if( direction == 5){
			direction = 42;
			return EAST;

		}
		return SOUTH;

	}

	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 'W';
	}
	
	
}
