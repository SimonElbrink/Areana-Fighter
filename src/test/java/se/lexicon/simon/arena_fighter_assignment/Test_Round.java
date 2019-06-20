package se.lexicon.simon.arena_fighter_assignment;

import org.junit.Before;
import org.junit.Ignore;
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
	public void test_isBiggest() {
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
	
	@Ignore("Not Done")
	@Test
	public void test_Before_Fight() {
		
		assertEquals(0, round.getRoundNumber());
		assertTrue(round.getRoundLog().isEmpty());
		
		
	}

}
