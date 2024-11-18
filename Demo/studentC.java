package Demo;

public class studentC {

	int id;
	String name;

	studentC() {
		id = 10;
		name = "Test";
	}

	studentC(int id, String name) {
		this.id = id;
		this.name = name;

	}

	void display() {
		System.out.println("name is: " + name);
		System.out.println("id is: " + id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentC s1 = new studentC();

		studentC s2 = new studentC(2, "Rayhana");
		s1.display();
		s2.display();

	}

}
