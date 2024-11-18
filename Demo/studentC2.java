package Demo;

public class studentC2 extends studentC {

	int javamark;

	studentC2() {

		id = 10;
		name = "Humaira";
		javamark = 20;
	}

	studentC2(int id, String name, int javamark) {

		super.id = id;
		super.name = name;
		this.javamark = javamark;

	}

	void display() {
		super.display();
		System.out.println("javamark: " + javamark);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentC2 cs1 = new studentC2();
		studentC2 cs2 = new studentC2(2, "amrtha", 30);
		cs1.display();
		cs2.display();

	}

}
