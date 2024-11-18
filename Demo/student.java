package Demo;

public class student {

	int age;
	String name;

	void printdetails() {
		System.out.println("age=" + age);
		System.out.println("name=" + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1 = new student();
		s1.age = 20;
		s1.name = "rayhana";

		student s2 = new student();
		s2.age = 30;
		s2.name = "zuhal";

		s1.printdetails();
		s2.printdetails();

	}

}
