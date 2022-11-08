package lab2;

import java.util.*;

public class Game {
	private Scanner keyboard; 
	private ArrayList<Location> locations;
	private Player player;

	public Game() {
		keyboard = new Scanner(System.in);
		locations = new ArrayList<>();
		//Create the world
		locations.add(new Outdoor("Shire", "\nYou are in the Shire. Everythings peaceful and pleasant.", "\nYou are in the Shire", null, new Gandalf("Gandalf", 0, new WearableItem(2.4, "elven_robe", 15, 0))));
		locations.add(new Outdoor("Rivendell", "\nYou are in Rivendell. There are plenty of elves and everything's beautiful.", "\nYou are in Rivendell", new Weapon(2.4, "blade", 4, 5), null));
		locations.add(new Room("Prancing Pony", "\nYou enter the Prancing Pony. Something seems odd.", "\nYou enter Prancing Pony.", null, 40, new Frodo("Frodo", 0, new WearableItem(0.1, "The_One_Ring", 100000, 0)))); //sätt null
		locations.add(new Room("Moria", "\nYou enter Moria. Everything is dark.", "\nYou enter Moria.", new Torch(1.0 , "torch", 10, 0), 100001, new Balrog("Balrog", 4, null)));
		locations.add(new Outdoor("Mordor", "\nYou enter Mordor. You are scared and cold.", "\nYou enter Mordor.", new Shovel(2.0, "shovel", 5, 0), null));
		//Give each location their paths list. First element is north, second east etc. Illegal moves path back to same position. (see map in Main.java)
		locations.get(0).setPaths(locations.get(0), locations.get(0), locations.get(1), locations.get(0));
		locations.get(1).setPaths(locations.get(0), locations.get(2), locations.get(3), locations.get(1));
		locations.get(2).setPaths(locations.get(2), locations.get(2), locations.get(2), locations.get(1));
		locations.get(3).setPaths(locations.get(1), locations.get(4), locations.get(3), locations.get(3));
		locations.get(4).setPaths(locations.get(4), locations.get(4), locations.get(4), locations.get(3));

	}

	public void run() {
		String name;
		System.out.println("A wizard approaches you!\n'What is your name, young hobbit?'");
		name = keyboard.nextLine();
		System.out.println("\nHello " + name + "! You can move around by typing north/south/west/east. You will have to learn more commands as you play the game! (Hint: there is a command \"help\").");
		player = new Player(name, locations.get(0));
		//Describe and set first position to visited.
		player.getPosition().describeYourself();
		player.getPosition().setVisited(true);
		//Loop the game
		while (true) {
			String command;
			System.out.println("What do you want to do?");
			command = keyboard.nextLine();
			if (command.equals("help")) {
				System.out.println("items: lists your items\nwear+itemName: puts on the item\nuse+itemName: use the item\notherwise: You are on your own, sorry!");
				}else {
					if (player.doCommand(command)) {
						System.out.println(" ");
					} else {
						System.out.println("Invalid command.");
					}
				}
			}
		}
	}




/* 
Buggar:
Kan inte använda items när det finns NPCs?


saker att fixa:

lista med items och npcs i location. .add när vi instansierar i början.
		      for (NPC npc : player.getPosition().getLocationNpc()) {
		          npc.doCommand(command, player);
		        }


checka att det är lätt att göra nya subklasser.

Npc --> NPC
 */