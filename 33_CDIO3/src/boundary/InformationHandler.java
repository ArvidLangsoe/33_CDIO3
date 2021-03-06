package boundary;

import java.awt.Color;
import java.util.concurrent.TimeUnit;

import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import text.GameText;

public class InformationHandler {
	// Array of fields in the GUI
	private Field[] fields = new Field[21];
	// Array of possible cars for the GUI
	private Car[] cars;

	/**
	 * Initialize the GUI, adding all the fields and preparing the cars for the
	 * player.
	 */
	public void startGame() {
		// Creates 21 fields
		for (int i = 0; i < 21; i++)
			fields[i] = new Street.Builder().setTitle(GameText.fieldTitles[i]).setSubText(GameText.fieldSubText[i])
					.setDescription(GameText.fieldShortDescription[i]).build();

		// Create the board and add the 21 fields.
		GUI.create(fields);
		// Creates cars for the 6 players.
		cars = createCars();
	}

	/**
	 * Add the players to the GUI.
	 * 
	 * @param players
	 *            Array of the players names.
	 */
	public void addPlayers(String[] players) {
		for (int i = 0; i < players.length; i++)
			GUI.addPlayer(players[i], 30000, cars[i]);
	}

	/**
	 * Create all the possible cars for the players.
	 * 
	 * @return Car[] of all the cars.
	 */
	private Car[] createCars() {
		Car[] carArray = new Car[6];
		carArray[0] = new Car.Builder().primaryColor(Color.BLUE).secondaryColor(Color.BLACK).typeUfo().patternFill()
				.build();
		carArray[1] = new Car.Builder().primaryColor(Color.RED).secondaryColor(Color.BLACK).typeUfo().patternFill()
				.build();
		carArray[2] = new Car.Builder().primaryColor(Color.GREEN).secondaryColor(Color.BLACK).typeTractor()
				.patternFill().build();
		carArray[3] = new Car.Builder().primaryColor(Color.YELLOW).secondaryColor(Color.BLACK).typeTractor()
				.patternFill().build();
		carArray[4] = new Car.Builder().primaryColor(Color.PINK).secondaryColor(Color.BLACK).typeRacecar()
				.patternFill().build();
		carArray[5] = new Car.Builder().primaryColor(Color.WHITE).secondaryColor(Color.BLACK).typeRacecar()
				.patternFill().build();
		return carArray;
	}

	/**
	 * Show information to the player with a confirmation button.
	 * 
	 * @param msg
	 *            The message.
	 * @param button
	 *            What the button says.
	 */
	public static void showInformation(String msg, String button) {
		GUI.getUserButtonPressed(msg, button);
		// everything below this point is for testing purposes.
//		 try {
//		 TimeUnit.MICROSECONDS.sleep(200000);
//		 } catch (InterruptedException e) {
//		 // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 }
	}

	/**
	 * Changes the balance of a designated player.
	 * 
	 * @param playerName
	 *            Name of the player.
	 * @param playerBalance
	 *            The new balance.
	 */
	public static void changePlayerBalance(String playerName, int playerBalance) {
		// Change the balance.
		GUI.setBalance(playerName, playerBalance);

	}

	/**
	 * Sets the owner of a field on the GUI.
	 * 
	 * @param playerName
	 *            Name of the player.
	 * @param position
	 *            Position of the field.
	 */
	public static void setOwnerOfField(String playerName, int position) {
		GUI.setOwner(position, playerName);
	}

	/**
	 * Removes the owner of a field at a given position.
	 * 
	 * @param position
	 *            The position of the field.
	 */
	public static void removeOwnerOfField(int position) {
		GUI.removeOwner(position);
	}

	/**
	 * Moves the players car to a position.
	 * 
	 * @param playerName
	 *            Name of the player to be moved.
	 * @param position
	 *            New position of the player.
	 */
	public static void movePlayer(String playerName, int position) {
		// Remove all the cars of the player
		GUI.removeAllCars(playerName);
		// Place a new car on the new position.
		GUI.setCar(position, playerName);
	}

	/**
	 * Remove all cars of a player.
	 * 
	 * @param playerName
	 *            Name of the player.
	 */
	public static void removePlayer(String playerName) {
		// Remove all the cars of the player
		GUI.removeAllCars(playerName);
	}

	/**
	 * Show the dice roll on the dice in the GUI.
	 * @param CurrentDice int[] of the dice values.
	 */
	public static void showRoll(int[] currentDice) {
		GUI.setDice(currentDice[0], currentDice[1]);
	}

}
