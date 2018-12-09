package inheritance;

public class main_class_interface {

	public static void main(String[] args) {
		
		callinginterface ci = new callinginterface();
		ci.neeraj();
		ci.neeraj(10);
		ci.arvind();
		ci.arvind(150);
		
		First_interfce fi =new callinginterface();
		fi.neeraj();
		fi.neeraj(15);
		
		Second_interfce si =new callinginterface();
		si.arvind();
		si.arvind(50);
	}

}
