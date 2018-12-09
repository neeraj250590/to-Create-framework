package inheritance;

public class callingInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent pr = new parent();
		pr.address();
		
		childGirl cg = new childGirl();
		cg.surname();
		cg.surname(1);
		cg.vehicle(12);
		cg.vehicle(21, 56);
		

	}

}
