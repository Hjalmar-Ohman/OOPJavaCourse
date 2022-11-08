package lab2;

public class WearableItem extends Item {
	private boolean wearing=false;

	public WearableItem(double weigth, String name, int price, int damage) {
		super(weigth, name, price, damage);
	}

	public  void putOn(Player player) {
		//command wear toggles if you are wearing it.
		if (this.wearing == false) {
			this.wearing = true;
			System.out.println("You are now wearing the " + this.getName());
			if (this.getName().equals("elven_robe")){
				player.setTrusted(true);
			}
		} else {
			this.wearing = false;
			System.out.println("You take off your " + this.getName());

			if (this.getName().equals("elven_robe")){
				player.setTrusted(false);
			}
		}
	}

	public boolean doCommand(String command, Player player) {
		if (command.equals("wear " + this.getName())) {
			putOn(player);
			return true;
		} else {
			return false;
		}
	}
}