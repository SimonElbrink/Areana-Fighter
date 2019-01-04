package se.lexicon.simon.arena_fighter_assignment;

import se.lexicon.simon.number_generator.RandomNumberGenerator;

public class Round {

	public void rollDice () {
	
RandomNumberGenerator rng = RandomNumberGenerator.getInstance();
		
		int rolldice = rng.getRandomIntBetween(1, 6);
		System.out.println(rolldice);
		
		
		
	}
	
}
