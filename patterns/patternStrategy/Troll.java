package patterns.patternStrategy;

public class Troll extends Character {

	public Troll() {
		weapon = new SwordBehavior();
	}
	
	
	
	@Override
	public void fight() {
		// TODO Auto-generated method stub

	      System.out.println("Troll = Sword");	
		
		
	}

}
