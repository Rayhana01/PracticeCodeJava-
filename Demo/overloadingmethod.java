package Demo;

public class overloadingmethod {
	
	//methods with same name and different paramters 
	// methods with same name and different paramters data types

	static void add(int a, int b) {
		System.out.println(a + b);
	}

	static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	static void add(double a, double b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(100, 20);
		add(20, 30, 10);
		add(100.20, 30.21);

	}

}

