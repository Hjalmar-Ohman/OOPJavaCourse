package lab2;

public class Frodo extends Person {

	public Frodo(String name, int health, Item personItem) {
		super(name, health, personItem);
	}


	@Override
	public void interactWith(Player player) {
		if (this.isItemPickedUp()) {
			System.out.println("Still dead.");
		} else {
			if (player.getTrusted()) {
			System.out.println("*cough*... '" + player.getName() + "' ... 'I was ambushed' ... 'Take the ring' ... 'go to Mord'... the hobbit breathes out one last breath. He's dead.\n ");
			this.giveItem(player);
			} else {
				System.out.println("Who are you? You don't look friendly... (Hint: elven_robe)");
			}
		}
	}
	
	@Override
	public void printYourself() {
		System.out.println("There is a hobbit lying on the floor. You can 'talk' to him.");
	}
}
