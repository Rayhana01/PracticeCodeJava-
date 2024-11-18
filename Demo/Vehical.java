package Demo;

//Create a base class called Vehicle with a method start().
//Create two subclasses, Car and Bike, that override the start() method to print different messages (e.g., "Car is starting" and "Bike is starting").
//Create objects of Car and Bike in your main method and call the start() method on each.

public class Vehical {
	void start() {
		System.out.println("the car will start now");
	}

	class car extends Vehical {
		void start() {
			System.out.println("the car is starting");
		}
	}

	class Bike extends Vehical {
		void start() {
			System.out.println("the bike is starting");
		}
	}

	public static void main(String[] args) {
		
		Vehical v1 = new Vehical();
		car c1 = v1.new car();
		Bike b1 = v1.new Bike();

		c1.start();
		b1.start();

	}

}
