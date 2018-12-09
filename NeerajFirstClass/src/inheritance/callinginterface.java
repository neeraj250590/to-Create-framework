package inheritance;

public class callinginterface implements First_interfce, Second_interfce{

	

	@Override
	public void neeraj() {
		// TODO Auto-generated method stub
		System.out.println("neeraj with zero params");
	}

	@Override
	public void neeraj(int a) {
		// TODO Auto-generated method stub
		System.out.println("neeraj with 1 params "+a);
	}

	@Override
	public void arvind() {
		// TODO Auto-generated method stub
		System.out.println("Arvind with zero params");
		
	}

	@Override
	public void arvind(int x) {
		// TODO Auto-generated method stub
		System.out.println("Arvind with one params "+x);
	}

}
