package practiceconstructor;

public class prac_constrctor {
	
	int p=10;
	int q=5;
	
	prac_constrctor() {
	
		System.out.println("this is default constructor");
		System.out.println();
		
	}

	prac_constrctor(int x, int y){
		
		this.p=x;
		System.out.println(this.p+" - This is parameterized constructor value");
		this.q=y;
		System.out.println(this.q+" - This is parameterized constructor second value");
		int h = this.p+this.q;
		System.out.println(h+" sum value");
		
	}
	
	public void sum(int a, int b) {
		
		int z=a+b;
		System.out.println(z);
		
	}
}
