package CarMagmt;

import java.util.Scanner;

public class CarInheritence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the type of car (0 for WagonR, 1 for HondaCity, 2 for InnovaCrysta):");
		int carType = scanner.nextInt();

		System.out.println("Enter the mileage of the car:");
		int mileage = scanner.nextInt();

		Car car;
		switch (carType) {
		case 0:
			car = new WagonR(mileage);
			break;
		case 1:
			car = new HondaCity(mileage);
			break;
		case 2:
			car = new InnovaCrysta(mileage);
			break;
		default:
			System.out.println("Invalid car type.");
			return;
		}

		System.out.println("Is sedan: " + car.getIsSedan());
		System.out.println("Number of seats: " + car.getSeats());
		System.out.println("Mileage: " + car.getMileage());

	}

}
