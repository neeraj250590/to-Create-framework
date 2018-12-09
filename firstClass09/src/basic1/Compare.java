package basic1;

// 3 param
// big number print

public class Compare {
	
	public void com(int a, int b, int c) {
		
		if (a>b && a>c) {
			System.out.println(a);
		}
		
		else if (b>a && b>c) {
			System.out.println(b);
		}
		
		else if (c>a && c>b) {
			System.out.println(c);
		}
		
		else if (a==b && b==c && c==a) {
			System.out.println("value is zero");
		}
		
		else {
			System.out.println("not success");
			
		}
	}
 
}



