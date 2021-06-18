package game;

import fixtures.Room;

public class RoomManager {
	
	
	private Room[] house;
	
	private Room startingRoom;
	
	public RoomManager(int roomCount) {
		super();
		house = new Room[roomCount];
	}
	
	public void init() {
		
		Room entryway = new Room();
		entryway.setName("Entry Way");
		entryway.setShortD("A narrow entryway");
		entryway.setLongD("A long dimly lit entry way."
				+ "To the north sits a dark room with a lamp that sits at the"
				+ "\ncenter next to an empty chair.");
		entryway.setOptions("\nOptions:"
				+ "\n1. Move North");

		this.house[0] = entryway;
		
		setStartingRoom(entryway);
		
		
		Room sanctum = new Room();
		sanctum.setName("\nSanctum");
		sanctum.setShortD("A small, mysterious, dimly lit room.");
		sanctum.setLongD("A small dark room with a lamp at the center next to a recliner."
				+ "\nMoonlight drifts in through a window on the west wall.");
		sanctum.setOptions("\nOptions:"
				+ "\n1. Move South"
				+ "\n2. Pull Lamp Chain");
		this.house[1] = sanctum;
		
		Room theStudy = new Room();
		theStudy.setName("\nThe Study");
		theStudy.setShortD("A well lit room with a dead body.");
		theStudy.setLongD("The room is now very bright, illuminated by sunlight shining through"
				+ " the window on the west wall."
				+ "\nA bone-dry skeleton sits in the chair and the lamp has disappeared."
				+ "\nA long hallway lies to the East.");
		theStudy.setOptions("\nOptions:"
				+ "\n1. Move East");
		this.house[2] = theStudy;
		
		Room theVoid = new Room();
		theVoid.setName("The Void");
		theVoid.setShortD("Nothing");
		theVoid.setLongD("Zero");
		theVoid.setOptions("Ziltch");
		this.house[3] = theVoid;
		
		Room assemblyLine = new Room();
		assemblyLine.setName("\nThe Assembly Line");
		assemblyLine.setShortD("A long hallway with paintings on each side.");
		assemblyLine.setLongD("As you walk down the hallway you notice that none of the people in the paintings have eyes."
				+ "\nEven stranger, you feel as though they are watching you."
				+ "\nYou get to the middle of the hallway and notice a room almost excatly like the one you just left."
				+ "\nYou turn around to compare the rooms but find that a darkness is begining to creep up on you.");
		assemblyLine.setOptions("\nOptions:"
				+ "\n1. RUN");
		this.house[4] = assemblyLine;
		
		Room theCage = new Room();
		theCage.setName("\nThe Cage");
		theCage.setShortD("A well lit room similar to the Study.");
		theCage.setLongD("The room is very bright, illuminated by sunlight shining through"
				+ " the window on the west wall."
				+ "\nThe chair is empty and the lamp is lit."
				+ "\nThe lamp is your only hope of survival as the darkness closes in on you.");
		theCage.setOptions("\nOptions:"
				+ "\n1. Pull Lamp Chain Again");
		this.house[5] = theCage;
		
		Room theStudy2 = new Room();
		theStudy2.setName("\nThe Study");
		theStudy2.setShortD("A dark room with a dead body.");
		theStudy2.setLongD("The room is now very bright, illuminated by sunlight shining through"
				+ " the window on the west wall."
				+ "\nA bone-dry skeleton sits in the chair and the lamp has disappeared."
				+ "\nA voice speaks to you \"Thank you for freeing my body and soul, traveller.\""
				+ "\nIt's time to leave");
		theStudy2.setOptions("\nOptions:"
				+ "\n1. Leave");
		this.house[6] = theStudy2;
		
		Room[] entrywayExits = new Room[] {sanctum, null, null, theVoid, null, null, null};
		entryway.setExits(entrywayExits);
		Room[] sanctumExits = new Room[] {null, null, entryway, theVoid, theStudy, null, null};
		sanctum.setExits(sanctumExits);
		Room[] theStudyExits = new Room[] {null, assemblyLine, null, theVoid, null, null, null};
		theStudy.setExits(theStudyExits);
		Room[] assemblyLineExits = new Room[] {null, null, null, theVoid, null, theCage, null};
		assemblyLine.setExits(assemblyLineExits);
		Room[] theCageExits = new Room[] {null, null, null, theVoid, null, null, theStudy2};
		theCage.setExits(theCageExits);
		Room[] theStudy2Exits = new Room[] {null, null, null, theVoid, null, null, null};
		theStudy2.setExits(theStudy2Exits);
	}
	
	public Room getRoom(int index) {
		return house[index];
	}

	public Room[] getHouse() {
		return house;
	}

	public void setHouse(Room[] house) {
		this.house = house;
	}

	public Room getStartingRoom() {
		startingRoom.print();
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}

}
