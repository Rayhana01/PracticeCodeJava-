package Demo;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] marks = { 10, 30, 45, 66 };

		try {

			System.out.println(marks[4]);

		}

		catch (Exception e) {
			System.out.println("Exception: " + e);
		}

		System.out.println(marks[1]);

	}

}
