package project;

public abstract class AquaticOrganism {

	private String name;
	private int age;

	AquaticOrganism() {

	}

	public AquaticOrganism(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public abstract void showDetails();
}
