package se.lexicon.simon.arena_fighter_assignment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test_Round {
	Round round;
	Fighter opponent;
	Fighter player;
	
	@Before
	public void init () {
		
		player = new Fighter("Simon");
		opponent = new Fighter();
		
		round = new Round();
	}
	
	
	@Test
	public void test_isPlayerStrongest() {
		player.attack(5);
		
		Boolean isPlayerStrongest = round.isPlayerStrongest(player, opponent);
		
		assertTrue(isPlayerStrongest);
	}
	
	@Test
	public void test_playerAsWinnerShouldReturnStringOfWinner() {
		
		opponent.setHealth(0);
		
		String expected = "Simon";
		
		String actual = round.winner(player, opponent);
		
		assertTrue(actual.startsWith(expected));	
	}
	
	@Test
	public void test_opponentAsWinnerShouldReturnStringOfWinner() {
		
		player.setHealth(0);
		
		String unexpected = "Simon";
		
		String actual = round.winner(player, opponent);
		
		assertNotEquals(unexpected, actual);
	}
	
	@Test
	public void test_WinnerShouldBeAssigndScoreOfOne() {
		
		opponent.setHealth(0);
		
		int expected = 1;
		
		round.winner(player, opponent);
		
		assertEquals(expected, player.getScore());
				
	}
		
	@Test
	public void test_IncrementroundNumber() {
		
		assertEquals(0,round.getRoundNumber());
		
		round.IncrementRoundNumber();
		
		assertEquals(1, round.getRoundNumber());
		
	}
	
	@Test
	public void test_Before_Fight() {
		
		assertTrue(round.getRoundNumber() == 0);
		assertTrue(round.getRoundLog().isEmpty());
		assertTrue(player.isAlive() && opponent.isAlive() == true);
		assertTrue(player.getStrength() == 0);
		assertTrue(opponent.getStrength() == 0);

	}

	@Test
	public void test_After_Fight() {
				
		round.fight(player, opponent);
		
		assertFalse(round.getRoundNumber() == 0);
		assertFalse(round.getRoundLog().isEmpty());
		assertFalse(player.isAlive() && opponent.isAlive() == true);
		
		assertTrue(player.getStrength() == 0);
		assertTrue(opponent.getStrength() == 0);
	}
}
