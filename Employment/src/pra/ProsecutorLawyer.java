package pra;

public class ProsecutorLawyer extends Lawyer{
	public ProsecutorLawyer(int id, String name){
		super(id,name);
	}

	public int getSalary(){
		return super.getSalary() + 50000;
	}

}
