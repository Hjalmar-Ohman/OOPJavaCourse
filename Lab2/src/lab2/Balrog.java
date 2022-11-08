package lab2;

public class Balrog extends Monster {

	public Balrog(String name, int health, Item personItem) {
		super(name, health, personItem);
	}


	@Override
	public void printYourself() {
		if (isAlive()) {
			System.out.println("There is a massive " + this.getNpcName() + " gazing down on you. Get a weapon and 'attack' if you dare...");
		} else {
			System.out.println("There is a dead " + this.getNpcName() + " on the ground. Scary.");
		}
	}

	@Override
	public void attack(Player player) {
		if (isAlive()) {
			if (this.getHealth()>player.getAttack()) {
				System.out.println("You need a blade.");
			} else {
				setAlive(false);
				System.out.println("You defeated the Balrog!");
			}
		}else {
			System.out.println("You hit the dead monster.");
		}
	}
}
