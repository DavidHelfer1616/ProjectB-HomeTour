package game;

import java.util.Scanner;

public class Main {
	
	private static RoomManager manager = new RoomManager(7);

	public static void main(String[] args) {
		
		manager.init();
		
		Player player = new Player();
		
		player.setCurrentRoom(manager.getStartingRoom());
		
		Scanner input = new Scanner(System.in);
		String direction = null;
		
		while (direction != "q") {
			direction = input.nextLine();
			if (direction.equalsIgnoreCase("Leave")) {
				System.out.println("\nGood Bye");
				break;
			}
			player.setCurrentRoom(player.getCurrentRoom().getExit(direction));
			if (player.getCurrentRoom() == manager.getRoom(3)) {
				System.out.println("\nTry Again");
				player.setCurrentRoom(manager.getStartingRoom());
				continue;
			}
			player.printCurrRoom();
		}
		input.close();
	}

	


}
