package project;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aquarium a = new Aquarium();
		int choice;
		do {
			System.out.println("\n--- Aquarium Ecosystem Simulator ---");
			System.out.println("1. Add a fish");
			System.out.println("2. Add an aquatic plant");
			System.out.println("3. Show all organisms");
			System.out.println("4. Feed the fish");
			System.out.println("5. Clean the aquarium");
			System.out.println("0. Exit");
			System.out.print("Choose an option: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the fish's name: ");
				String fishName = sc.next();

				System.out.println("Enter the fish's Age: ");
				int fishAge = sc.nextInt();
				a.addOrganism(new Fish(fishName, fishAge));
			case 2:
				System.out.print("Enter the plant's name: ");
				String plantName = sc.next();

				System.out.print("Enter the plant's age: ");
				int plantAge = sc.nextInt();
				sc.nextLine();

				a.addOrganism(new AquaticPlant(plantName, plantAge));
				break;

			case 3:
				a.showAll();
				break;

			case 4:
				a.feedFish();
				break;

			case 5:
				a.clean();
				break;

			case 0:
				System.out.println("Goodbye!");
				break;

			default:
				System.out.println("Invalid option. Please try again.");
			}
		} while (choice != 0);

		sc.close();
	}
}
