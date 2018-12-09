package oops.inheritance;

public class callingclass {
	public static void main(String[] args) {
	
	phonepeGlobal ph = new phonepeGlobal();     // interface
	ph.D2H();
	ph.Electricitybill();
	ph.mobilerechare();
	ph.M2C();
	ph.M2M();
	ph.Q2Q();
	
	phonepeooking phnbook= new phonepeGlobal();                // first way to call the interface method
	phnbook.test();
	phnbook.test1();
	
	
	phonepereBank phn = new phonepeGlobal();                 // Secondary way to call the interface method
	phn.M2C();
	phn.M2M();
	
	
	stringCla str=new stringCla();                       // string
	str.string();
	
	grandfather gf=new grandfather();                     // inheritance ---- parent class---showing only parent class method
	gf.address();
	gf.mobilenumber();

	
	father fa=new father();                           // inheritance ---- sub class---showing both parent and sub- class method
	fa.mobile();
	
	child ch=new child();
	ch.childmobile();
}
}