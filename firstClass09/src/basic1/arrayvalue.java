package basic1;

public class arrayvalue {

	public void arryval() {
		// hardcoded
		int a[] = { 1, 2, 3, 5, 6 };
		System.out.println(a[0] + "hardcoded");
		System.out.println(a[2] + "hardcoded");

		// initialization
		// int[] b= new int[4];

		String[] str = new String[6];
		str[0] = "A";
		str[1] = "C";
		for (int i = 0; i < 2; i++) {
			System.out.println(str[i]);
		}
		/*
		 * System.out.println(str[0]); System.out.println(str[1]);
		 */

	}

	public void max() {
		int a[] = { 3, 5, 6, 2 };

		int maxnumber = a[0];

		for (int i = 0; i < 4; i++) {

			if (maxnumber < a[i]) {

				maxnumber = a[i];

			}
		}
		System.out.println(maxnumber + "max value");
	}

	public void multidim() {
		int arrmd[][] = { { 1, 2, 3 }, { 5, 6, 7 } };
		System.out.println(arrmd[1][2]);
	}

	public void multidimfor() {
		int arrmd[][] = { { 1, 2, 3 }, { 5, 6, 7 } };

		for (int i = 0; i < 2; i++) { // Comment - Created this loop for row
			System.out.println();

			for (int j = 0; j < 3; j++) { // Comment - Created this loop for column
				System.out.print(arrmd[i][j]);
			}

		}
	}
	
	
   public void maxdim() {
	   int ar[][] = { { 1, 2, 3 }, { 5, 6, 7 } };
	   int  max= ar[1][2];
	   
	   for (int i = 0; i < 2; i++) {
		   for (int j = 0; j < 3; j++) {
			   if (max<ar[i][j]) {
				   
				   max =ar[i][j];
				   
				 //  int min = max;
				   
				  
				   
		   }
		   
			
		}
		   
		
	}
	   
	   System.out.println(max + " max "); 
   }

}
