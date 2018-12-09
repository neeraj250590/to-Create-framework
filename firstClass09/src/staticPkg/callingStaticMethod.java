package staticPkg;

public class callingStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticCls.statc(10,15);
		System.out.println(staticCls.a);
		
		
		staticCls s = new staticCls();
		System.out.println(s.a);
		s.a= 125;
		System.out.println(s.a);
		
		staticCls s1 = new staticCls();
		System.out.println(s.a);
		s.a= 15;
		System.out.println(s.a);    // this thing is normally ask in interview
		
		finalKeywrd.statc(5, 51);                              // calling final value keyword
		System.out.println(finalKeywrd.a);
		
		finalKeywrd fk = new finalKeywrd();
		System.out.println(finalKeywrd.pi);
		
	}

}
