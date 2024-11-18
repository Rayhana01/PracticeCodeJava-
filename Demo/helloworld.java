package Demo;

public class helloworld {
	
	// declearing methods with paramters like int a or int b then calling them with values in main method

	static void add(int a, int b) {
		System.out.println(a + b);
	}

	static void sub(int a, int b) {
		System.out.println(a - b);
	}

	static void div(int a, int b) {

		System.out.println(a / b);
	}

	static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(10, 20);
		add(30, 20);
		sub(30, 10);
		sub(60, 10);
		div(20, 2);
		multiply(10, 30);

	}

}
