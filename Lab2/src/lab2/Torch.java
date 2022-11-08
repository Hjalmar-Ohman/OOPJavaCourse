package lab2;

public class Torch extends Tool {

	public Torch(double weigth, String name, int price, int damage) {
		super(weigth, name, price, damage);
	}

	@Override
	public  void use(Player player) {
		if(player.getPosition().getName().equals("Moria")) {
			System.out.println("You light your torch. But it is still dark.");
		}else {
			System.out.println("There's no point in lighting your torch right now. Maybe it will be useful in Moria");
		}
	}

	@Override
	public boolean doCommand(String command, Player player) {
		if (command.equals("use torch")) {
			use(player);
			return true;
		} else {
			return false;

		}
	}
}
