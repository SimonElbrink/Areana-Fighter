package se.lexicon.simon.arena_fighter_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import se.lexicon.simon.number_generator.RandomNumberGenerator;

public class Round {
	
	private int roundNumber;
	private List<String> roundLog;
	RandomNumberGenerator rng = RandomNumberGenerator.getInstance();
	
	
	
	public Round() {
		this.roundNumber = 0;
		this.roundLog = new ArrayList<>(Arrays.asList());
	}
	
	
	
	public void fight(Fighter player, Fighter opponent) {
		
		appendLog("Your in Fight");
		
		appendLog(player.getInfo());
		appendLog(opponent.getInfo());
		
		do {
			setRoundNumber(++roundNumber);
			appendLog("Round: " + getRoundNumber());
			
			player.attack(rollDice());
			opponent.attack(rollDice());
			
			boolean evaluate = isBiggest(player.getStrength(), opponent.getStrength());

			if (evaluate) {
				opponent.takeDamage(player.getStrength());

				appendLog(opponent.getName() + " Took Damage of " + player.getStrength());

			} else {
				player.takeDamage(opponent.getStrength());

				appendLog(player.getName() + " Took Damage of " + opponent.getStrength());
			}

		} while (player.isAlive() && opponent.isAlive() == true);
		

	}
	

	/**
	 * Method favors player
	 * @param playerStrength
	 * @param opponentStrength
	 * @return
	 */
	public boolean isBiggest(int playerStrength, int opponentStrength) {
		
		if(playerStrength >= opponentStrength)
			return true;
		
		return false;
	}	

	public int rollDice () {
				return rng.getRandomIntBetween(1, 6);
	}

	public int getRoundNumber() {return roundNumber;}
	public void setRoundNumber(int roundNumber) {this.roundNumber = roundNumber;}
	
	public void appendLog(String log) {roundLog.add(log);}
	public void setRoundLog(List<String> roundLog) {this.roundLog = roundLog;}
	public List<String> getRoundLog() {return this.roundLog;}
	
}
