package project;

public class Aquarium implements Cleanable {
	private AquaticOrganism[] organisms = new AquaticOrganism[10];
	private int count = 0;

	public void addOrganism(AquaticOrganism organism) {
		if (count < organisms.length) {
			organisms[count] = organism;
			count++;
			System.out.println("Organism added to the aquarium.");
		} else {
			System.out.println("The aquarium is full.");
		}
	}

	public void showAll() {
		if (count == 0) {
			System.out.println("The aquarium is empty.");
			return;
		}

		for (int i = 0; i < count; i++) {
			organisms[i].showDetails();
		}
	}

	public void feedFish() {
		for (int i = 0; i < count; i++) {
			if (organisms[i] instanceof Feedable) {
				((Feedable) organisms[i]).feed();
			}
		}
	}

	@Override
	public void clean() {
		organisms =new AquaticOrganism[10];
		System.out.println("The aquarium has been cleaned.");

	}

}
