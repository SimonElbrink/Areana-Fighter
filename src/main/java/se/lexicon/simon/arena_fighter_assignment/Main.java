package se.lexicon.simon.arena_fighter_assignment;

public class Main {
	
	public static void main (String[] args) {
		
		Fighter player = new Fighter("Simon");
		Fighter opponent = new Fighter();
		
		Battle battle = new Battle(player, opponent);
		boolean isFightOver = battle.battle();
		
		
		
	}
	
	
}
