import java.util.*;
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			palindrom m=new palindrom(); 
			int r =0 ,sum=0,temp;    //O(1)
			Scanner input = new Scanner(System.in);
				 
			System.out.println("Type some number!");
			String answer=input.next(); //O(1)
			
			boolean quit = true;
				 
			while(quit){
		    int n = Math.abs(Integer.parseInt(answer));  //O(1)
		    String str=String.valueOf(n);// plug  in the number oftyping number //O(1)
		    //System.out.println("Value:: "+str);
			temp=n; 


				  // while(n>0){    
				  //  r=n%10;  //getting remainder  
				  //  sum=(sum*10)+r;    
				  //  n=n/10;    
				  // }  
		    
		    
		      int check=m.recursive(str,0,str.length()-1);
		      //System.out.println("Equal: "+check);

				  if(check==1) { //O(1)
				    System.out.println("Yes! This is palindrome number "); 
				  }   
				  else if(check ==0)   {//O(1)
				     System.out.println("No. This is not palindrome"); 
				  } 
				//System.out.println("Type q to quit");
				answer = input.next(); //O(1)
				if(answer.equals("q")){
				  quit = false;
				  System.exit(0);
				}
				 }
		 }



		int recursive(String str,int i,int j){ // checking the value whether palindrome
	
			
		if(i>=j){// Keep checking array index, and if array number is same. //O(1)
		  return 1;
		}
		else if(str.charAt(i)!=str.charAt(j)) { // if beginning and end array index number are different, it isn't palindrome
			//O(1)
			return 0;
		}
		  

		return recursive(str,i+1,j-1); // O(n)

		}
		

	}


