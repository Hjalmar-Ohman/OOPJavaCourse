package lab2;

public abstract class Person extends NPC {
	private boolean itemPickedUp = false;

	public Person(String name, int health, Item personItem) {
		super(name, health, personItem);
	}

	public abstract void printYourself();

	@Override
	public boolean doCommand(String command, Player player) {
		if (command.equals("talk")) {
			this.interactWith(player);
			return true;
		} else {
			return false;
		}
	}
	public void giveItem(Player player) {
		player.addItems(getPersonItem());
		this.itemPickedUp = true;
	}

	public abstract void interactWith(Player player);

	public boolean isItemPickedUp() {
		return itemPickedUp;
	}

}
