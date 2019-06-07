package se.lexicon.simon.arena_fighter_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author Simon Elbrink
 *
 */
public class Test_Fighter {
	
	Fighter fighter;
	

	@Before
	public void init() {
		
		fighter = new Fighter();
	}
	
	@Test
	public void Test_Values_When_Created() {
		
		int strength = 0;
		int health = 30;
		int score = 0;
		
		assertFalse(fighter.getName().isEmpty());
		assertEquals(strength, fighter.getStrength());
		assertEquals(health, fighter.getHealth());
		assertEquals(score, fighter.getScore());
		assertFalse(fighter.isRetired());
		assertTrue(fighter.getHistory().isEmpty());
		
	}
	
	@Test
	public void Test_attack() {

		int randomModifier = 5;
		
		fighter.attack(randomModifier);
		
		assertEquals(randomModifier, fighter.getStrength());
		
	}
	
	@Test
	public void Test_TakeDamage() {
		
		int health = 25;
		
		fighter.takeDamage(5);
		
		assertEquals(health, fighter.getHealth());
		
		
	}
	
	@Test
	public void Test_IsAlive() {
		
		int health = 0;
		int damage = 9000;
		fighter.takeDamage(damage);
		
		assertEquals(health, fighter.getHealth());
		assertFalse(fighter.isAlive());
		
	}
	
	@Test
	public void Test_AddToHistory() {
		
		int size = 1;
		String log = "Test";
		
		fighter.addToHistory(log);
				
		assertTrue(size == fighter.getHistory().size());
		assertFalse(fighter.getHistory().isEmpty());
		assertEquals(log, fighter.getHistory().get(0));
		
	}
	
	@Test
	public void Test_Retire() {
		
		assertFalse(fighter.isRetired());
		
		fighter.retire();
		
		assertTrue(fighter.isRetired());
		
	}
	
}
