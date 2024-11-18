package Demo;

public class person {

	String Name;
	String LastName;
	int age;
	int height;

	public void PrintDetails() {
		System.out.println("Name: " + Name);
		System.out.println("LastName: " + LastName);
		System.out.println("age:" + age);
		System.out.println("height:" + height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person pp = new person();
		pp.Name = "Noor";
		pp.LastName = "Banu";
		pp.age = 24;
		pp.height = 165;

		pp.PrintDetails();

	}

}
