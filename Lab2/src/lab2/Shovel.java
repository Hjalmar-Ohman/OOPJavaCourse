package lab2;

public class Shovel extends Tool {

	public Shovel(double weigth, String name, int price, int damage) {
		super(weigth, name, price, damage);
	}

	@Override
	public  void use(Player player) {
		if(player.getPosition().getName().equals("Rivendell")) {
			System.out.println("You dig and find nothing!");
		}else {
			System.out.println("Klonk! Can't dig here. Maybe its useful in Rivendell.");
		}
	}
	@Override
	public boolean doCommand(String command, Player player) {
		if (command.equals("use shovel")) {
			use(player);
			return true;
		} else {
			return false;
		}
	}
}