package se.lexicon.simon.arena_fighter_assignment;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class Test_Battle {
	
	Battle battle;
	
	
	@Before
	public void init() {
		Fighter player = new Fighter("Simon");

		battle = new Battle(player);
		
	}
	
	@Test
	public void test_Appendlog() {
		String battleLog = "Test";
		String battleLog1 = "Test1";
		
		assertTrue(battle.getBattleLog().isEmpty());
		
		battle.appendLog(battleLog);
		battle.appendLog(battleLog1);
		
		assertFalse(battle.getBattleLog().isEmpty());
		assertEquals(battleLog, battle.getBattleLog().get(0));
		assertEquals(battleLog1, battle.getBattleLog().get(1));
		
	}
	@Test
	public void Test_Battle_PlayerisDead() {
		
		battle.getPlayer().takeDamage(battle.getPlayer().getHealth());
		
		boolean alive = battle.battle();
		
		assertFalse(alive);
	}
	
	@Test
	public void Test_Battle_playerisAlive() {
		
		battle.getOpponent().takeDamage(battle.getOpponent().getHealth());
		
		boolean alive = battle.battle();
		
		assertTrue(alive);
	}

}
