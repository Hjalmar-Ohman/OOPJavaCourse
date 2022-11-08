package lab2;

import java.util.ArrayList;

public class Player {

	private String name;
	private Location position;
	private ArrayList<Item> playerItems = new ArrayList<>();
	private int gold;
	private int health;
	private int attack;
	private boolean isTrusted = false;


	public Player(String name, Location position){
		this.name = name;
		this.position = position;
	}

	public int getAttack() {
		return this.attack;
	}
	public void setTrusted(boolean isTrusted) {
		this.isTrusted = isTrusted;
	}
	public boolean getTrusted() {
		return this.isTrusted;
	}

	public String getName() {
		return name;
	}
	public Location getPosition(){
		return this.position;
	}
	public ArrayList<Item> getPlayerItems(){
		return this.playerItems;
	}
	public void setPosition(Location newPosition){
		//Illegal move => OUCH
		if(newPosition == position) {
			System.out.println("OUCH");
		}
		this.position = newPosition;
		newPosition.describeYourself(); 
		newPosition.setVisited(true);

	}

	public void addItems(Item item) {
		playerItems.add(item);
		this.attack+=item.getDamage();
		System.out.println("You picked up " + item.getName() + ".");
	}

	public boolean doCommand(String command) {
		if (command.equals("items")) {
			if (!playerItems.isEmpty() ) {
				for (Item it : getPlayerItems()) {
					it.printYourself();
				}
				return true;
			} else {
				System.out.println("You currently have no items.");
				return true;
			}
		} else  {
			//if player has items
			if (!this.getPlayerItems().isEmpty())
				for (Item it : this.getPlayerItems()) {
					if (command.contains(it.getName())){
						return it.doCommand(command, this);
					}
				} 	
		}
		
		return this.position.doCommand(command, this);

	}
}