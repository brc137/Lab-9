import java.util.Scanner;
public class Fleet{

	private static String model = "";
	private static int weight = 0;
	private static String color = "";
	private static double mpg = 0.0;
	private static int year = 0000;
	private static String notes = "System notes: \n";
	private static String make = "";

	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
		Vehicle car1 = new Vehicle(); //Using base constructor, just makes a Vehicle object for us to use and nothing else

		System.out.println("Car 1:");

System.out.print("Enter the model of the vehicle 1: ");
		car1.setModel(keyboard.next());

System.out.print("Enter the weight of the vehicle 1: ");
		car1.setWeight(keyboard.nextInt());

System.out.print("Enter the color of the vehicle 1: ");
		car1.setColor(keyboard.next());

System.out.print("Enter the year of the vehicle 1: ");
		car1.setYear(keyboard.nextInt());

System.out.print("Enter the MPG of the vehicle 1: ");
		car1.setMPG(keyboard.nextDouble());

System.out.print("Enter the make of the vehicle 1: ");
		car1.setMake(keyboard.next());

		car1.stats();

		//Lets test out data hiding logic, lets make another Vehicle object

		Vehicle car2 = new Vehicle(model,weight,color,mpg,year,make);
		//Using Overload Constructor so we can create AND define our object in 1 simpler line

		// You can see how 2 constructors work to do the same thing but in 2 different ways

		System.out.println("Car 2:");

System.out.print("Enter the model of the vehicle 2: ");
		car2.setModel(keyboard.next());

System.out.print("Enter the weight of the vehicle 2: ");
		car2.setWeight(keyboard.nextInt());

System.out.print("Enter the color of the vehicle 2: ");
		car2.setColor(keyboard.next());

	System.out.print("Enter the year of the vehicle 2: ");
		car2.setYear(keyboard.nextInt());

System.out.print("Enter the MPG of the vehicle 2: ");
		car2.setMPG(keyboard.nextDouble());

System.out.print("Enter the make of the vehicle 2: ");
		car2.setMake(keyboard.next());

		car2.stats();


	}



}
