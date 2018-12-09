package basic1;

public class ConditionalStatement {

	public int calculator(String operator, int a, int b) {
		int result = 0;

		if (operator.contains("PLUS")) {
			result = a + b;
		}

		else if (operator.contains("Minus")) {
			// result = a - b;
			if (a < b) {
				result = b - a;
			}

		}

		else if (operator.contains("Multiply")) {
			result = a * b;
		}

		else if (operator.contains("Divide")) {
			result = a / b;
		}

		else {
			System.out.println("not success");
		}
		return result;

	}

}
