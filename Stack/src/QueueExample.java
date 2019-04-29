import java.util.*;
public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(42);
		q.add(23);
		q.add(5);
		
		for(int i = 0;i<q.size();i++){
			int element=q.remove();
			if (element>=30){
				System.out.println(element);
				q.add(element);
			}
			
		}
		System.out.println();
		while(!q.isEmpty()){
			System.out.println(q.remove());
		}
		
	}

}
