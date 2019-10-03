import java.io.*;
import java.util.*;
public class contacts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		System.out.println("Please choose the either first character option");	
		boolean flag = false;	
		boolean quit = true;
		while(quit) {		
		Scanner fin = new Scanner(new File("/Users/kazukikanke/eclipse-workspace/ContactsDatabase/src/contacts.txt"));
		Scanner input = new Scanner(System.in);	
		
		System.out.print("(s)ave a contact.\n" + "(f)ind a contact.\n" + "(p)rint all contacts out to the screen.\n" + "(q)uit \n" + "[sfpq]: ");	
		char op = input.nextLine().charAt(0);
		
		if (op == 's') {// Save a contact in database
			System.out.println("Enter new contact's Name : ");
			String name = input.nextLine();
			System.out.println("Enter new phone's Number : ");
			String phone = input.nextLine();
			PrintWriter out = new PrintWriter(new FileWriter("/Users/kazukikanke/eclipse-workspace/ContactsDatabase/src/contacts.txt", true));
			out.write("\n");
			out.write(name);
			out.write("\n");
			out.write(phone);
			out.close();
			
			
		}
		else if(op == 'f') {// Find a contact addresss
			
			System.out.println("Enter Name to search for: ");
			String name = input.nextLine();
		
			flag = false;
			try
			{
			
			while(fin.hasNextLine()) { // Looking for person's name
				String nm=fin.nextLine();
				if(name.equals(nm)){
					System.out.println("Number: " +fin.nextLine());
					fin.close();
					flag = true;
					break;
				}	
			}
			
			if(flag==false) {
				System.out.println("ERROR: Contact not found");
				fin.close();
			}
			
		
			}
			catch(Exception ex){
				//empty
			}
			finally{
				fin.close();
			}
			
		
			
		}
		else if(op == 'p') {// Print all contact address
			
			System.out.println("|NAME  " + " |NUMBER");
			try	{
			
			while(fin.hasNextLine()){
				
				System.out.println(fin.nextLine() + "\t" + fin.nextLine() );
				}
			}
			catch(Exception ex){
				
			}
			finally{
				fin.close();
			}
			//System.out.println(fin.nextLine());
			
			
		}
		else if(op == 'q') {// Quit
			
			quit = false;
			System.exit(0);
			
		}
		else {
			System.out.println("INVALID OPTION!");
		}
		
		}
	}

}
