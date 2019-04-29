package birthdayday;
import java.util.*;

public class BirthDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("What month, day, and year were you born?");
	Scanner input = new Scanner(System.in);
	int month = input.nextInt();
	int day = input.nextInt();
	int year = input.nextInt();
	
	TeacherDate birth = new TeacherDate(year, month,day); //represent birth year and month and date
	
	
	System.out.println("You were born on "+ year+ "/"+ month+"/"+day+ ", which was a "+birth.getDayOfWeek());
	
	TeacherDate age = new TeacherDate();// represent today
	
	int date =0;
	if(birth.isLeapYear()){
		System.out.println( year  + " was a leap year. ");
	}
	int count = 0;
	if(birth.getMonth() 
			== age.getMonth() && birth.getDay()==age.getDay() ){
		count++;
		System.out.println("Happy birthday!  You are now age " + count);
	}
	
	
	while (birth.getYear() != age.getYear() || birth.getMonth() // to count how many days took time
									!= age.getMonth() || birth.getDay()  !=age.getDay()) {
		date++;
		birth.nextDay();
		
	}
	
	
	
	
	System.out.println("It will be your birthday in "+date+" days");
	System.out.println("You are "+ date +" days old ");
	}
	
	
		
	

}
