package exceptionhandling;

public class handling {

	public static void main(String[] args) {
	
		
		try {
			System.out.println("Exception handling");
			System.out.println(0/0);
			
		} /*catch (Exception e) {
			// TODO: handle exception
		//	System.out.println(e.getMessage());
			System.err.println("Exception occured");
		}
		*/
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Exception occured");
			e.getStackTrace();                          // need to understand this method
		}
		
		finally {
			System.out.println("final exception");
		}
	}
	
	
}
