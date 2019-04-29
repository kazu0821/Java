package birthdayday;
import java.util.*;

public class BirthDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("What month, day, and year were you born?");//ask what is your birthday
		Scanner input = new Scanner(System.in);
		int month = input.nextInt(); // write month , day and year this order
		int day = input.nextInt();
		int year = input.nextInt();

		TeacherDate birth = new TeacherDate(year, month,day); //represent birth year and month and date


		System.out.println("You were born on "+ year+ "/"+ month+"/"+day+ ", which was a "+birth.getDayOfWeek());
		// show your birthday and what's the date you are born

		TeacherDate today = new TeacherDate();// represent today

		int date =0;
		if(birth.isLeapYear()){
			System.out.println( year  + " was a leap year. ");
		} 
		int age = 0;  
		// tell today is your birthday and show your age

		TeacherDate birth3 = new TeacherDate(year, month,day);

		while (birth3.getMonth() < today.getMonth()){
			birth3.nextDay();
			age++;

		}
		if( birth3.getMonth() == today.getMonth() && birth3.getDay()==today.getDay() ){

			System.out.println("Happy birthday!  You are now age " + age);

		}
		else{
			System.out.println("eroor occuer");
		}
		// to count how many days took time 



		TeacherDate birth2 = new TeacherDate(year, month,day);

		while (birth2.getYear() != today.getYear() || birth2.getMonth() 
				!= today.getMonth() || birth2.getDay()  !=today.getDay()) {
			date++;
			birth2.nextDay();


		}



		int date2 =0;
		while (today.getMonth() != birth.getMonth() && today.getDay() != birth.getDay()){
			date2++;

			birth.nextDay();
		}

		System.out.println("It will be your birthday in "+date2+" days");// output result


		System.out.println("You are "+ date +" days old ");
	}

}	




