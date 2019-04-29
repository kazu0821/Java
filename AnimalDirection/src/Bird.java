import java.util.Random;

public class Bird implements Critter {



	public int getMove(CritterInfo info){
		Random rand = new Random();//Random method

		int direction = rand.nextInt(4)+ 1;

		if (direction == 1){    // when direction is 1, go to north
			direction = -1;
			return NORTH; //north
		}
		else if (direction == 2){ // when direction is 2, go to south
			direction = 3;
			return SOUTH; 				//south 

		}
		else if (direction == 3){ // when direction is 3, go to East
			direction = 8;
			return EAST;				//east
		}
		else if (direction == 4){ // when direction is 4, go to west
			direction = 11;
			return WEST;           //
		}
		else if( direction == 5){ // when direction is5, go to center
			direction = 42;
			return CENTER;

		}
		return SOUTH;


	}

	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return  'B'; // Bird character is B
	}	

}