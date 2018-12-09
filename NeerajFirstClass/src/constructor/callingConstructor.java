package constructor;

public class callingConstructor {

	public static void main(String[] args) {
		
		Employee em = new Employee(1, "neeraj");
		Employee em1 = new Employee(2, "neeraj1");
		
		em.info();
		em1.info();
	}

}
