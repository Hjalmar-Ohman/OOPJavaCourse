package lab2;

public abstract class NPC {
	private String npcName;
	private int health;
	private Item personItem;
	
	public NPC(String name, int health, Item personItem) {
		this.npcName = name;
		this.health = health;
		this.personItem = personItem;
	}
	
	public String getNpcName() {
		return npcName;
	}

	public Item getPersonItem() {
		return personItem;
	}
	
	public int getHealth() {
		return health;
	}

	public abstract void printYourself();
	
	public abstract boolean doCommand(String command, Player player);


}
