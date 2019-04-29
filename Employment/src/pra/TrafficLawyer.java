package pra;

public class TrafficLawyer extends Lawyer {
	public TrafficLawyer(int id, String name){
		super(id,name);
	}
	public int getSalary(){
		return super.getSalary() + 50000;
	}

	int sum =(int) 4.0;
}
