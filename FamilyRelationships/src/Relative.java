import java.io.*;
import java.util.*;
public class Relative {

	public static void main(String[] args)  throws FileNotFoundException {
		// TODO Auto-generated method stub

		giveIntro();
		FamilyInfo family = new FamilyInfo();//class

		Scanner input = new Scanner(new File("tudor.dat"));//I input file directly
		System.out.println();
		family.read(input);
		Scanner console = new Scanner(System.in);
		showInfo(console, family);

	}

	// program explained to the user
	public static void giveIntro() {
		System.out.println("This program will show you all of the ancestors");
		System.out.println("and descendants of a person.");
		System.out.println();

	}

	// user prompted for name of person to show info for; info shown
	public static void showInfo(Scanner console, FamilyInfo list) {

		System.out.println("Write Person's name");
		String name = console.nextLine();

		Person next = list.getPerson(name);//get the person name
		if (name.equalsIgnoreCase("quit")){
			System.exit(0);
		}else if (next.equals(null)||(list.getPerson(next.getName())).getName().equals("")){
			System.out.println("there are no matching anyone");

		}else{
			showRelatives(next);
			System.out.println("Ancesters: ");
			showAncestors(next,6);
			System.out.println("Descendants: ");
			System.out.println("   "+next.getName());
			showDescendants(next,6);
		}
		console.close();
	}
	// shows the ancestors and descendats of the given person
	public static void showRelatives(Person current) {


	}
	public static void showAncestors(Person current, int level) {
		if (current != null){
			for (int i = 0;i <= level;i++){
				System.out.print("  ");
			}
			System.out.println(current.getName());
			showAncestors(current.getMother(), level+4);
			showAncestors(current.getFather(), level+4);//showing  ancestors 
		}
	}
	public static void showDescendants(Person current, int level) { 
		ArrayList<Person> kids = current.getKids();
		if (kids.size() ==0){
			System.out.print("");
		}else {
			for (Person kid : kids){
				for (int i =0; i <level ;i++){
					System.out.print("  ");
				} 
				System.out.print("  ");
				System.out.println(kid.getName());
				showDescendants(kid,level +3);//showing decendents
			}
		}
	}
}


