package Demo;

public class methodoverloading2 {

	// method overloading with subraction and divison

	static void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	static void subtraction(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	static void subtraction(double a, double b, double c) {
		System.out.println(a - b - c);
	}

	// method overloading with Division

	static void div(int a, int b) {
		System.out.println(a / b);
	}

	static void div(int a, int c, int d) {
		System.out.println(a / (c * d));

	}

	static void div(double a, double b) {

		System.out.println(a / b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subtraction(30, 10);
		subtraction(100, 20, 20);
		subtraction(23.00, 10.30, 56.23);

		div(20, 2);
		div(24, 4, 2);
		div(10.2, 9.5);

	}

}
