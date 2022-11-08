package lab2;

public class Room extends Location {
	private int size;

	public Room(String name, String descriptionLong, String descriptionShort, Item locationItem, int size, NPC locationNpc) {
		super(name, descriptionLong, descriptionShort, locationItem, locationNpc);
		this.size = size;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void describeYourself() {
		if(getIsVisited() == false) {
			System.out.println(getDescriptionLong());
			System.out.println("This room is " + size + " square meters.");
		}else {
			System.out.println(getDescriptionShort());
		}
		if (getLocationItem() != null) {
			if (!getLocationItem().isPickedUp()) {
				System.out.println("There is a " + getLocationItem().getName() + " on the floor.");
			}
		}

		for (int i = 0; i < 4; i++) {
			if (!getPaths().get(i).getName().equals(getName()) && i == 0) {
				System.out.println("There is a door leading north");
			} else if (!getPaths().get(i).getName().equals(getName()) && i == 1) {
				System.out.println("There is a door leading east");
			} else if (!getPaths().get(i).getName().equals(getName()) && i == 2) {
				System.out.println("There is a door leading south");
			} else if (!getPaths().get(i).getName().equals(getName()) && i == 3) {
				System.out.println("There is a door leading west");
			}
		}
		if (getLocationNpc() != null) {
			this.getLocationNpc().printYourself();
		}
	}
}