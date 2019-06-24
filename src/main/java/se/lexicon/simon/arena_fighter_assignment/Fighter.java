package se.lexicon.simon.arena_fighter_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static se.lexicon.erik.name_gen.RandomNameGenerator.*;
/**
 * 
 * @author Simon Elbrink
 *
 */
public class Fighter {

	private String name;
	private int strength;
	private int health;
	private int score;
	private boolean retired;
	private List<String> history;
	

	public Fighter() {
		this.name = getRandomFullName();
		this.health = 30;		
		this.history = new ArrayList<>(Arrays.asList());
	}
	
	/**
	 * 
	 * @param name
	 */
	public Fighter(String name) {
		this();
		this.name = name;
	}
	
	
	public int attack(int randomModifier) {
		return this.strength = randomModifier;
	}
	
	public void takeDamage(int damage) {
		
		this.health -= damage;
		
		if (this.health < 0) this.health = 0;
	}
	
	
	public String getInfo() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("Fighter");
		builder.append("\n name=");
		builder.append(name);
		builder.append("\n health=");
		builder.append(health);
		builder.append("\n score=");
		builder.append(score);
		
		return builder.toString();
	}
	
	
	public void printHistory() {
		this.history.forEach(l -> System.out.println(l));
		}
	
	public void addToHistory(String log) {
		this.history.add(log);
	}
	public List<String> getHistory() {return history;}
	public void setHistory(List<String> history) {this.history = history;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public int getStrength() {return strength;}
	protected void setStrength(int strength) {this.strength = strength;}

	public int getHealth() {return health;}
	public void setHealth( int health) {this.health = health;}
	
	public int getScore() {return score;}
	public void addToScore(int scoreToAdd) {this.score += scoreToAdd;}
	
	public boolean isRetired() {return retired;}
	public void retire() {this.retired = true;}

	public boolean isAlive() {		
		if (this.health <= 0) {
			return false;
		} else {
			return true;
		}		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (retired ? 1231 : 1237);
		result = prime * result + health;
		result = prime * result + score;
		result = prime * result + strength;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fighter other = (Fighter) obj;
		if (retired != other.retired)
			return false;
		if (health != other.health)
			return false;
		if (score != other.score)
			return false;
		if (strength != other.strength)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fighter");
		builder.append("\n name=");
		builder.append(name);
		builder.append("\n strength=");
		builder.append(strength);
		builder.append("\n health=");
		builder.append(health);
		builder.append("\n score=");
		builder.append(score);
		builder.append("\n retired=");
		builder.append(retired);
		builder.append("\n history=");
		builder.append(history);
		return builder.toString();
	}
	
}
