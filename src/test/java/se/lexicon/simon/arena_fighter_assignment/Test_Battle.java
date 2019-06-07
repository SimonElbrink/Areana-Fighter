package se.lexicon.simon.arena_fighter_assignment;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class Test_Battle {
	
	Battle battle;
	
	
	@Before
	public void init() {
		Fighter player = new Fighter("Simon");
		Fighter opponent = new Fighter();
		
		battle = new Battle(player, opponent);
		
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

}