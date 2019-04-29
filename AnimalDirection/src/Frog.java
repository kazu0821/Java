import java.util.Random;

public class Frog implements Critter {

	public int getMove(CritterInfo info){
		Random rand = new Random();

		int direction = rand.nextInt(2)+ 1;
		// Frog has three ways. so changing way by using random method


		if (direction == 1){//if 1 1, go to north
			direction = -1;
			return NORTH; //north
		}
		else if (direction == 2){
			direction = 3;
			return SOUTH; 				//south 

		}
		else if (direction == 3){
			direction = 8;
			return EAST;				//east
		}
		return NORTH;

	}


	@Override
	public char getChar() {
		// TODO Auto-generated method stub
		return 'F';
	}
}