package fixtures;


public class Room extends Fixture {

	private Room[] exits;
	
	private Fixture[] items;
	
	int pullCount = 0;
	
	public Room getExit(String direction) {
		
		if (direction.equalsIgnoreCase("move north")) {
			return this.exits[0];
		}
		else if(direction.equalsIgnoreCase("move east")) {
			return this.exits[1];
		}
		else if(direction.equalsIgnoreCase("move south")) {
			return this.exits[2];
		}
		else if(direction.equalsIgnoreCase("pull lamp chain")) {
			return this.exits[4];	
		}
		else if(direction.equalsIgnoreCase("run")) {
			return this.exits[5];
		}
		else if(direction.equalsIgnoreCase("pull lamp chain again")) {
			return this.exits[6];	
		}
		else {
			return this.exits[3];
		}
	}

	public Room[] getExits() {
		return exits;
	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}

	public Fixture[] getItems() {
		return items;
	}

	public void setItems(Fixture[] items) {
		this.items = items;
	}


}
