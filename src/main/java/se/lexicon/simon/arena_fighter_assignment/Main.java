package se.lexicon.simon.arena_fighter_assignment;

public class Main {
	
	public static void main (String[] args) {
		String battleLog = "Test";
		
		Fighter player = new Fighter("Simon");
		Fighter opponent = new Fighter();
		
		Battle battle = new Battle(player, opponent);
		
		battle.appendLog(battleLog);
		battle.appendLog(battleLog);
		
		battle.getBattleLog().stream()
		.forEach(System.out::println);
		
	}
	
	
}
