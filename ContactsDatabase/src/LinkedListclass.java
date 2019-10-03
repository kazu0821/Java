import java.io.*;
import java.util.*;
public class LinkedListclass{
	Nodeclass head;
	
	Scanner input = new Scanner(System.in);
	
	
	LinkedListclass()
	{
		head=null;
	}
	void append()
	{
		}
	
	
	void display() throws Exception
	{
		while(true)
		{
			System.out.print("(s)ave a contact.\n" + "(f)ind a contact.\n" + "(p)rint all contacts out to the screen.\n" + "(d)elete \n" + "(q)uit \n" + "[sfpq]: ");	
			char op = input.nextLine().charAt(0);	
			
			if (op == 's') {// Save a contact in database
								
				saveData();
			}
			else if(op == 'f') {// Find a contact addresss
				findData();
				
				}
			
			else if(op == 'p') { // Print all data
				printData();
				
				
			}
			
			else if(op == 'd') {
				
				delete();
				
			}
				
			else if(op =='q')	{ // quit the program
				
				PrintWriter out = new PrintWriter(new FileWriter("/Users/kazukikanke/eclipse-workspace/ContactsDatabase/src/contacts.txt", false));
				
				Nodeclass i = head;
				while(i != null) 
				{
					
					out.write("\n");
					out.write(i.name);
					out.write("\n");
					out.write(i.phone);
					
					i = i.next;
				}
				
				
				
				out.close();
				
				
				quit();
			}
			
			
					
		}
			
	}
	
	void saveData()
	{
		System.out.println("Enter new contact's Name : ");
		String name = input.nextLine();
		System.out.println("Enter new phone's Number : ");
		String phone = input.nextLine();
		
		Nodeclass temp=new Nodeclass();
		temp.name=name;
		temp.phone=phone;
		temp.next=null;
		
		if(head==null)
		{
			head=temp;
		}
		else {
			Nodeclass i = head;
			
			while(i.next != null) {
				i = i.next;
					
			}
			
			i.next = temp; //pointing to the temp
			
		}
	}
	
	void findData() {
		
		System.out.println("Enter Name to search for: ");
		String name = input.nextLine();
		
		Nodeclass i = head;
		
		while(i != null) {
			
			if(i.name.equals(name)) {
				System.out.println(i.phone);
				
				return ;
			}
			
				i = i.next;
			
			
		}
		
		
		System.out.println("Error: Not Found ");
		
	}
	
	
	void printData() {
		Nodeclass i = head;
		while(i != null) {
			System.out.println("\n" + i.name + "\n" + i.phone);
			i = i.next;
		}
		
	}
	
	void delete() {
		
		System.out.println("Enter Name to delete for: ");
		String name = input.nextLine();
		
		Nodeclass i = head;
		Nodeclass j = null;
		
		while(i != null ) {
			if(i.name.equals(name)) {
				j.next = i.next;
				
				return ;
			}
			j=i;
			i=i.next;
		}
		
		System.out.println("Error: Not Found ");
		
	}
	
	
	void quit() {
		
		
		System.exit(0);
		
	}
	public static void main(String args[]) throws Exception
	{
		LinkedListclass ll=new LinkedListclass();
		ll.display();
	}
}


