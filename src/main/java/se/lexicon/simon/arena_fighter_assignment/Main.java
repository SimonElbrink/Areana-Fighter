package se.lexicon.simon.arena_fighter_assignment;

import static se.lexicon.simon.arena_fighter_assignment.Input.*;

public class Main {
	
	public static void main (String[] args) {
		
		System.out.print("Welcome!\nEnter your Fighters Name: ");
		String name = getStringFromUser();
		Fighter player = new Fighter(name);
		
		
		do {
			Battle battle = new Battle(player);
			battle.battle();
			
			if (player.isAlive() == true) {
				System.out.print("You survived!\nRetire or Fight Again?\nR/F: ");
				switch (getStringFromUser().toUpperCase()){
				
				case "R": 
					player.retire();
					System.out.println(player.getName() + " Is retired\nSee you Around!");
				break;
				
				case "F":
					System.out.println(player.getName() + " Is getting ready to fight ones more.");
					player.setHealth(30);
					break;

				}
			} else {
				System.out.println("Your dead, sorry");
			}
		} while (!player.isRetired() && player.isAlive() == true);
		
		System.out.println("Good Bye");
	}
	
	
}
