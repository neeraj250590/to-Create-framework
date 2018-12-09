package basic1;

public class Forloop {
	
	public void loopfirst(int a) {
		
		for (int i = 0; i <=a; i++) {
			
			System.out.println(i);
			
		}
	}
		// TODO Auto-generated constructor stub
	
	public void table(int b)	{
		int sum=0;
		for (int i = 1; i <=10; i++) {
			
			//System.out.println(b*i);                  //  Comment: It will print the table like 2, 3, 4, .......
			
			sum = b*i + sum;
			
		}
		System.out.println(sum);
	}
		
	
	}


