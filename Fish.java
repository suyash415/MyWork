package project;


public class Fish extends AquaticOrganism implements Feedable {
	
	
	private int hunger;
	private int health;

	Fish() {
	}

	public Fish(String name, int age) {
		super(name, age);
		hunger = 50;
		health = 100;
	}

	@Override
	public void feed() {
		hunger -= 10;

		if (hunger < 0) {
			hunger = 0;
		}

		System.out.println(getName() + " has been fed.");
	}

	@Override
	public void showDetails() {
		System.out.println("Fish: " + getName() + ", Age: " + getAge() + ", Hunger: " + hunger + ", Health: " + health);
	}

}
