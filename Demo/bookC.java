package Demo;

public class bookC {

	String Name;
	int price;
	String publication;
	String author;

	bookC() {
		publication = "xyz publication";
		author = "Rayhana Ibrahim";
	}

	void display() {
		System.out.println("Name: " + Name);
		System.out.println("price: " + price);
		System.out.println("publication: " + publication);
		System.out.println("author: " + author);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bookC b1 = new bookC();
		b1.Name = "think positive";
		b1.price = 20;
		b1.display();

		bookC b2 = new bookC();
		b2.Name = " how to be millionaire";
		b2.price = 100;
		b2.display();

		bookC b3 = new bookC();
		b3.Name = "Java";
		b3.price = 20;
		b3.display();

	}

}
