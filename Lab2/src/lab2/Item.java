package lab2;

public abstract class Item {
	private double weigth;
	private String name;
	private int price;
	private int damage;
	private boolean pickedUp = false;

	public Item(double weigth, String name, int price, int damage) {
		this.weigth = weigth;
		this.name = name;
		this.price = price;
		this.damage=damage;
	}
	
	public int getDamage() {
		return this.damage;
	}
	public String getName() {
		return this.name;
	}
	
	public void printYourself() {
		System.out.println(name + " (" + weigth + " kg)");
	}

	public void setPickedUp(boolean bool) {
		this.pickedUp = bool;
	}

	public boolean isPickedUp() {
		return this.pickedUp;
	}

	public abstract boolean doCommand(String command, Player player);
}