import java.util.*;
public class LotteryNumber {

	public static final int NUMBERS = 6;
	public static final int MAX_NUMBER = 40;
	public static final int PRIZE = 100;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> winning =  createWinningNumbers();
		Set<Integer> ticket = getTicket();
		System.out.println();
		
		Set<Integer>matches =new TreeSet<Integer>(ticket);
		matches.retainAll(winning);
		
		System.out.println("Yuor ticktes was :"+ ticket);
		System.out.println("winning numbers "+ winning);
		
		if (matches.size()>0){
			
			double prize = 100*Math.pow(2,matches.size());
			System.out.println("Mqatches numbers "+matches);
			System.out.printf("Your prize is ", prize);
			
			
		}
		
	}
	public static Set<Integer> createWinningNumbers(){
		Set<Integer> winning = new TreeSet<Integer>();
		Random r = new Random();
		while (winning.size()< NUMBERS ){
			int number = r.nextInt (MAX_NUMBER)+1;
			winning.add(number);
			
		}
		return winning;
	}

	public static Set<Integer> getTicket(){
		Set<Integer> ticket = new TreeSet<Integer>();
		Scanner console = new Scanner(System.in);
		System.out.print("Type "+NUMBERS + " lotto numbers");
		while (ticket.size() <NUMBERS){
			int number = console.nextInt();
			ticket.add(number);
		}
		return ticket;
	}
	
}
