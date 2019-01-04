package se.lexicon.simon.arena_fighter_assignment;

public class Gladiator {

	private String name;
	private int strength;
	private int health;
	private boolean alive;
	
	//Basic Value
	public Gladiator () {
		this("UnknownGladiator", 5);
	}
	
	//Setting value
	public Gladiator (String name, int health) {
		this.name = name;
		this.health = health;
	}

	public boolean isAlive() {
		return alive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
	
}
