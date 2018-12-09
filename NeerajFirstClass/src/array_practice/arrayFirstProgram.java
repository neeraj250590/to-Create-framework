package array_practice;

import java.util.Scanner;

public class arrayFirstProgram {

	/*public void arraymethod() {
		int first[] = new int[5];
		String str[]= new String[10];
		
		String test= "Neeraj Shukla";
		
		first[0]= 5;
		first[1]= 100;
		System.out.println(first[3]);
		System.out.println(first[1]);
		System.out.println(test.length());      // Find out the string length
		
	}	*/
		public void nextInt(int n) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size");
			//int n = 0;
			
			int marks[]=new int[n];
			
			System.out.println("Array Length"+ marks.length);
			System.out.println("Enter"+n+"Elements");
			
			
			for (int i = 0; i < marks.length; i++) {
				
				marks[i] = sc.nextInt();
				
				int total=0;
				
				System.out.println("Elements are;");
				
				for (int j = 0; j < marks.length; j++) {
					
					System.out.println(marks[i]);
					
					total = total + marks[i];
					
				}
				System.out.println(total);
			}
						
			
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	

