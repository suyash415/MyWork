package project;

public class AquaticPlant extends AquaticOrganism {

	private int growth;

	AquaticPlant() {

	}

	public AquaticPlant(String name, int age) {
		super(name, age);
		growth = 1;
	}

	@Override
	public void showDetails() {
		System.out.println("Aquatic Plant: " + getName() + ", Age: " + getAge() + ", Growth: " + growth);
	}

}
