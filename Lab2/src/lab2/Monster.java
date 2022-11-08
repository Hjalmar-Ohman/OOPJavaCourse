package lab2;

public abstract class Monster extends NPC {
	private boolean alive = true;

	public Monster(String name, int health, Item personItem) {
		super(name, health, personItem);
		// TODO Auto-generated constructor stub
	}


	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}


	@Override
	public abstract void printYourself();

	@Override
	public boolean doCommand(String command, Player player) {
		if (command.equals("attack")) {
			this.attack(player);
			return true;
		} else {
			return false;
		} 
	}


	public abstract void attack(Player player);

}
