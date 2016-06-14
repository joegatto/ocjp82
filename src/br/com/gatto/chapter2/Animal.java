package br.com.gatto.chapter2;

public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	private int age;
	private String name;

	private boolean playing;
	private Boolean dancing;

	public Animal() {
	}

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = (name == null || name.trim().length() == 0) ? null : name;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		if (species == null || species.trim().length() == 0)
			throw new IllegalArgumentException("Species is required");
		this.species = species;
	}

	public boolean isCanHop() {
		return canHop;
	}

	public void setCanHop(boolean canHop) {
		this.canHop = canHop;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0)
			throw new IllegalArgumentException("Age cannot be a negative number");
		this.age = age;
	}

	public boolean isPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	public Boolean getDancing() {
		return dancing;
	}

	public void setDancing(Boolean dancing) {
		this.dancing = dancing;
	}

	public String toString() {
		return species;
	}
}
