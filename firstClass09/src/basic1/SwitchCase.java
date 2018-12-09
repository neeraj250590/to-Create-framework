package basic1;

public class SwitchCase {
	
	public void weekday(int day) {
		switch (day) {
		
		case 0:
			System.out.println("Sun");
			break;
		
		case 1:
			System.out.println("Mon");
			break;
			
		case 2:
			System.out.println("Tue");
			break;
			
		default:
			System.out.println("Fail");
			break;
		}
	}

}
