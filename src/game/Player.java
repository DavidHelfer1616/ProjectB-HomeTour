package game;

import fixtures.Room;

public class Player {
	
		private Room currentRoom;
		
		public void printCurrRoom() {
			currentRoom.print();
		}
		
		public Room getCurrentRoom() {
			return currentRoom;
		}
		
		public void setCurrentRoom(Room currentRoom) {
			this.currentRoom = currentRoom;
		}
		
		
		
	
}
