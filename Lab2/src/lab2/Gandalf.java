package lab2;

public class Gandalf extends Person {

	public Gandalf(String name, int health, Item personItem) {
		super(name, health, personItem);
	}


	@Override
	public void interactWith(Player player) {
		if (this.isItemPickedUp()) {
			System.out.println("Go find Frodo.");
		} else {
			System.out.println("'Hello " + player.getName() + "! I need you to help me in destroying the One Ring. Frodo just left. Find him and take this elven_robe. It will be useful.'");
			this.giveItem(player);
		}
	}
	
	@Override
	public void printYourself() {
		System.out.println("The grey wizard is still there. You can 'talk' to him.");

	}

}
