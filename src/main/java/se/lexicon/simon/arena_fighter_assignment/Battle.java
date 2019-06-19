package se.lexicon.simon.arena_fighter_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Battle {
	
	private Fighter player;
	private Fighter opponent;
	private List<String> battleLog;
	
	
	public Battle(Fighter player) {
		this.player = player;
		this.opponent = new Fighter();
		this.battleLog = new ArrayList<>(Arrays.asList());
	}

	public boolean battle() {		
		Round round = new Round();
		
		round.fight(player, opponent);
		
		round.getRoundLog().forEach(l -> System.out.println(l));
		
		return player.isAlive();
	}


	
	public void appendLog(String log) {battleLog.add(log);}	
	public List<String> getBattleLog() {return battleLog;}
	
	public Fighter getPlayer() {return player;}
	public void setPlayer(Fighter player) {this.player = player;}

	public Fighter getOpponent() {return opponent;}
	public void setOpponent(Fighter opponent) {this.opponent = opponent;}
	
}
