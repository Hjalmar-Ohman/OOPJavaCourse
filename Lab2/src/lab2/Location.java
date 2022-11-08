package lab2;

import java.util.*;

public abstract class Location {

	private String name;
	private String descriptionLong;
	private String descriptionShort;
	private Item locationItem;
	private NPC locationNpc;
	private boolean isVisited = false;
	private ArrayList<Location> paths = new ArrayList<>();;



	public Location(String name, String descriptionLong, String descriptionShort, Item locationItem, NPC locationNpc){
		this.name = name;
		this.descriptionLong = descriptionLong;
		this.descriptionShort = descriptionShort;
		this.locationItem = locationItem;
		this.locationNpc = locationNpc;
	}

	public abstract void describeYourself();

	public void setPaths(Location north, Location east, Location south, Location west) {
		getPaths().add(north);
		getPaths().add(east);
		getPaths().add(south);
		getPaths().add(west);

	}
	public void setVisited(Boolean state) {
		this.isVisited = state;
	}

	public String getName() {
		return this.name;
	}

	public String getDescriptionLong() {
		return this.descriptionLong;
	}

	public String getDescriptionShort() {
		return this.descriptionShort;
	}

	public boolean getIsVisited() {
		return this.isVisited;
	}

	public ArrayList<Location> getPaths() {
		return this.paths;
	}

	public Item getLocationItem() {
		return this.locationItem;
	}
	public NPC getLocationNpc() {
		return this.locationNpc;
	}

	// TODO: Komplettering: The doCommand here is a little bit too
	// extensive. I would advice that you handle the player's items
	// through the player doCommand rather than through the location,
	// and the location shouldn't have to be aware of other classes'
	// commands. Consider a situation where we want to add another 25
	// NPC classes with their own activation commands. The
	// if-statement below would grow quite extensive. Tip: I realize
	// you have done this in order to get the "invalid command"
	// printouts. This can be solved by switching doCommand from void
	// to boolean, which also allows us to break execution when we
	// have successfully executed a command (let's say we have 5
	// shovels and attempt to dig, which could cause us to dig 5 times
	// rather than just the once).

	public boolean doCommand(String command, Player player) {
		String[] commands = command.split(" ");

		if (command.equals("look")) {
			describeYourself(); 
			return true;
			//If command equals north => set position's northern path.
		} else if (command.equals("north")) {
			player.setPosition(this.getPaths().get(0));
			return true;
		} else if (command.equals("east") ) {
			player.setPosition(this.getPaths().get(1));
			return true;
		} else if (command.equals("south")) {
			player.setPosition(this.getPaths().get(2));
			return true;
		} else if (command.equals("west") ) {
			player.setPosition(this.getPaths().get(3));
			return true;
		} else if (commands[0].equals("take")) {
			//check if there are any items on the location.
			if(this.getLocationItem()!=null) {
				//if the second word written is equal to the location item.
				if (command.equals("take " + this.getLocationItem().getName()) && !this.getLocationItem().isPickedUp()) { 
					player.addItems(this.getLocationItem());
					this.getLocationItem().setPickedUp(true);
					return true;	
				} else {
					System.out.println("There is no item here.");
					return true;
				}
			} else {
				return false;
			}
			//goes to item and NPC doCommand
		} else {
			//if there is an npc
			if (player.getPosition().getLocationNpc()!=null) {
				return getLocationNpc().doCommand(command, player);
			}
			return false;
		}
	}
}

/* Kartan

0
|
1 - 2
|   |
3 - 4
 */
