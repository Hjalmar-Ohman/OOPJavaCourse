package lab2;
import java.util.Random;
import java.util.ArrayList;

public class Outdoor extends Location {
	private ArrayList<String> weathers = new ArrayList<>();

	public Outdoor(String name, String descriptionLong, String descriptionShort, Item locationItem, NPC locationNpc) {
		super(name, descriptionLong, descriptionShort, locationItem, locationNpc);
		weathers.add("rainy");
		weathers.add("windy");
		weathers.add("sunny");
		weathers.add("foggy");
	}

	@Override
	public void describeYourself() {
		if(getIsVisited() == false) {
			System.out.println(getDescriptionLong());
		}else {
			System.out.println(getDescriptionShort());
		}
		
		Random rand = new Random();
		//random weather
		System.out.println("It is " + weathers.get(rand.nextInt(3))+ ".");
		
		//if there is an item thats not picked up
		if (getLocationItem() != null) {
			if (!getLocationItem().isPickedUp()) {
				System.out.println("There is a " + getLocationItem().getName() + " on the ground. Try to 'take " + getLocationItem().getName() +"'.");
			}
		}
		for (int i = 0; i < 4; i++) {
			if (!getPaths().get(i).getName().equals(getName()) && i == 0) {
				System.out.println("There is a road leading north.");
			} else if (!getPaths().get(i).getName().equals(getName()) && i == 1) {
				System.out.println("There is a road leading east.");
			} else if (!getPaths().get(i).getName().equals(getName()) && i == 2) {
				System.out.println("There is a road leading south.");
			} else if (!getPaths().get(i).getName().equals(getName()) && i == 3) {
				System.out.println("There is a road leading west.");
			}
		}
		if (getLocationNpc() != null) {
			this.getLocationNpc().printYourself();
		}
	}
}
