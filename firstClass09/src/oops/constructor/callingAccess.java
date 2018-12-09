package oops.constructor;

import access_modifire.callingmodifier;
import access_modifire.modifire;

public class callingAccess extends modifire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		modifire md = new modifire();
		md.publc();  
		
		callingAccess ca = new callingAccess();
		ca.protectd();     // calling protected
	}

}
