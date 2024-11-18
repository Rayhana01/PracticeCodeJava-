package Demo;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = null;

		try {
			name.length();
		} catch (Exception e) {
			System.out.println("Exception" + e);
		}

		System.out.println("name: " + name);

		int a = 10;

		System.out.println(a);

	}

}
