import java.util.*;
public class stackexample {
	
	public static void main(String[] args){
		Stack<Integer> s = new Stack<Integer>();
		s.push(42);
		s.push(23);
		s.push(5);
		s.push(43);
		s.push(99);
		System.out.println(max(s));
		while (!s.isEmpty()){
		System.out.println(s.pop());
		}
		
	}
	public static int max(Stack<Integer> s){
		Stack<Integer> backup = new Stack<Integer>();
		int maxValue =s.pop();
		int minValue = s.pop();
		
		while (!s.isEmpty()){
			int next =s.pop();
			backup.push(next);
			maxValue = Math.max(maxValue,next);
			minValue = Math.min(minValue, next);
		}
		while (!backup.isEmpty()){
			s.push(backup.pop());
		}
		return maxValue;
		
		
		
	}

}
