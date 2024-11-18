package Demo;

public class studentinheritance extends personinheritance {

	int rollno;
	String Class;

	void display() {
		
		super.display();
		System.out.println("rollno:" + rollno);
		System.out.println("Class:" + Class);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentinheritance si = new studentinheritance();
		si.rollno = 101;
		si.Class = "classB";
		si.age = 20;
		si.name = "zuhal";
		si.Address = "tiber falls, usa";
		si.display();

	}

}
