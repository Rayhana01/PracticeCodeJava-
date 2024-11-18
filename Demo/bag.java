package Demo;

public class bag {

	int price;
	String color;
	String model;

	void printdetails() {
		System.out.println("price=" + price);
		System.out.println("color:" + color);
		System.out.println("model:" + model);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bag bg = new bag();
		bg.price = 25;
		bg.color = "white";
		bg.model = "zara";

		bg.printdetails();

	}

}
