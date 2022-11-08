package lab2;

public  class Weapon extends Item {


	public Weapon(double weigth, String name, int price, int damage) {
		super(weigth, name, price, damage);
	}

	public boolean doCommand(String command, Player player) {
		return true;
	}


}
