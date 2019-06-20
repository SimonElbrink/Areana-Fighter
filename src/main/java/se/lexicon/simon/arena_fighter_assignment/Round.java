package se.lexicon.simon.arena_fighter_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import se.lexicon.simon.number_generator.RandomNumberGenerator;
/**
 * 
 * @author Simon Elbrink
 *
 */
public class Round {
	
	private int roundNumber;
	private List<String> roundLog;
	private RandomNumberGenerator rng;
	
	
	
	public Round() {
		this.roundNumber = 0;
		this.roundLog = new ArrayList<>(Arrays.asList());
		this.rng = RandomNumberGenerator.getInstance();
	}
	
	
	
	public void fight(Fighter player, Fighter opponent) {
		appendLog(player.getInfo());
		appendLog(opponent.getInfo());
		
		do {
			IncrementRoundNumber();
			appendLog("Round: " + getRoundNumber());
			
			player.attack(rollDice());
			opponent.attack(rollDice());
			
			boolean evaluate = isPlayerStrongest(player, opponent);

			if (evaluate == true) {
				opponent.takeDamage(player.getStrength());

				appendLog(opponent.getName() + " Took Damage of " + player.getStrength());

			} else {
				player.takeDamage(opponent.getStrength());

				appendLog(player.getName() + " Took Damage of " + opponent.getStrength());
			}

		} while (player.isAlive() && opponent.isAlive() == true);
		
		appendLog( winner(player, opponent) );
		
		appendLog(player.getInfo());
		appendLog(opponent.getInfo());
		

	}
	

	/**
	 * Method favors player
	 */
	public boolean isPlayerStrongest(Fighter player, Fighter opponent) {
		
		if(player.getStrength() >= opponent.getStrength())
			return true;
		
		return false;
	}	

	public int rollDice () {
				return rng.getRandomIntBetween(1, 6);
	}
	
	protected String winner(Fighter player, Fighter opponent) {
		if (player.isAlive() == true && opponent.isAlive() == false) {
			player.addToScore(1);
			return player.getName() + " Wins this battle!";

		} else if (player.isAlive() == false && opponent.isAlive() == true) {
			opponent.addToScore(1);
			return opponent.getName() + " Wins this battle!";

		}
			return "No Winner, it's sa Tie";
		

	}

	public int getRoundNumber() {return roundNumber;}
	public void IncrementRoundNumber() {++roundNumber;}
	
	public void appendLog(String log) {roundLog.add(log);}
	public void setRoundLog(List<String> roundLog) {this.roundLog = roundLog;}
	public List<String> getRoundLog() {return this.roundLog;}
	
}
