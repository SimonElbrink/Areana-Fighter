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
		Boolean isI1Biggest;
		int i1 = 4, i2 = 2;
		
		isI1Biggest = round.isBiggest(i1, i2);
		
		assertTrue(isI1Biggest);
		
	}
	
	@Ignore ("Not done yet")
	@Test
	public void test_fight() {
		
	}

}
