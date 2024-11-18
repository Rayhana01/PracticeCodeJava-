package Demo;

public class personinheritance {

	int age;
	String name;
	String Address;

	void display() {
		System.out.println("Age:" + age);
		System.out.println("Name:" + name);
		System.out.println("Address:" + Address);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		personinheritance ph = new personinheritance();
		ph.age = 12;
		ph.name = "Ray";
		ph.Address = "abc.usa";
		ph.rollno=101;
		ph.Class="classB";
		ph.display();

	}

}
