package lab2;

public abstract class Tool extends Item {

	public Tool(double weigth, String name, int price, int damage) {
		super(weigth, name, price, damage);
	}
	
	public abstract boolean doCommand(String command, Player player);
	public abstract void use(Player player);	
}