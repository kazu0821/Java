package pra;

			// extends method is copy data from employee
public class Lawyer extends Employee {
	
	
	public Lawyer (int id , String name){
		super(id, name);
	}
	public int getSalary(){
		return super.getSalary() + 50000;
	}

}
