package oops.constructor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateExample {
	
	
	public void dateformat() {
		Date d = new Date();
		//System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("MMddYYYY"); // date formats in java javatpoint.com
		System.out.println(sdf.format(d));
		
		

	}

}
