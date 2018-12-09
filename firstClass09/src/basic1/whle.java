package basic1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class whle {

	public void loop() {
		int i = 0;
		while (i <= 10) {

			i++;
			System.out.println(i + "test");
		}

	}

	public void two() {
		int i = 0;
		while (i <= 10) {
			System.out.println(i * 2 + " two table");
			i++;
		}

	}
	
	public void even(int y) {
		int i = 0;
		while (i <= y) {
			
			if (i%2==0) {
				System.out.println(i+" even number");
				
			}
			
			i++;
		}
		
		
	}
	
	public void dowhile() {     // Comment: need to complete
		int i =1;
		
		do {
			
			System.out.println("a");
			
		} while (i>=10);
		
		i++;
	}

}
