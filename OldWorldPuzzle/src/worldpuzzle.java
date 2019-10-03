import java.util.*;
public class worldpuzzle {
	void checking()
	 {
		String[] animal = {"GWC", "GCW", "WCG", "WGC","CGW","WGC", "CGW","CWG"};
		String str1 = animal[2];
		String str2 = "   ";
		char t=' ';
		char t1 = ' ';
		//System.out.println(" No Solution was found! ");
		
		while(str2.length() < 3) {
			
			t=str1.charAt(0);
			str1 = str1.substring(1,str1.length());
			
			if(str1.charAt(0) == 'G' && str1.charAt(1) == 'W') { // left side
				 System.out.println(" No Solution was found! ");
			}
			else if(str1.charAt(0) == 'W' && str1.charAt(1) == 'G') {
				System.out.println(" No Solution was found! ");
			}
			else if(str1.charAt(0) == 'G' && str1.charAt(1) == 'C') {
				System.out.println(" No Solution was found! ");
			}
			else if(str1.charAt(0) == 'C' && str1.charAt(1) == 'G') {
				System.out.println(" No Solution was found! ");
			}
			
					
			str2=str2+t; // adding the character to the right side
			
			
			if(str2.charAt(0) == 'G' && str2.charAt(1) == 'W') { // Right side
				t1=str2.charAt(0);
				str2 = str2.substring(1,str2.length()); //remove the character from right side
				str1=str1+t1;		//add character to the left side.	
				
			}
			else if(str1.charAt(0) == 'W' && str1.charAt(1) == 'G') {
				t1=str2.charAt(0);
				str2 = str2.substring(1,str2.length()); //add the character to right side
				str1=str1+t1;								
			}
			else if(str1.charAt(0) == 'G' && str1.charAt(1) == 'C') {
				t1=str2.charAt(0);
				str2 = str2.substring(1,str2.length()); //add the character to right side
				str1=str1+t1;
			}
			else if(str1.charAt(0) == 'C' && str1.charAt(1) == 'G') {
				t1=str2.charAt(0);
				str2 = str2.substring(1,str2.length()); //add the character to right side
				str1=str1+t1;
			}
			
			
			
			
		}//End of while loop	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		worldpuzzle wp=new worldpuzzle(); 
		wp.checking();
		
		
	}
}


