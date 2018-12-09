package constructor;

public class Employee {
	int empId;
	String empName;

	// parameterized constructor with two parameters
	Employee(int id, String name) {
		this.empId = id;
		this.empName = name;
		//System.out.println("Id: " + empId + " Name: " + empName);
	}

	void info() {
		System.out.println("Id: " + empId + " Name: " + empName);
	}

}
