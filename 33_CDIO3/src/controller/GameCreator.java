package controller;

import boundary.InformationHandler;
import boundary.InputHandler;
import text.InputText;

public class GameCreator {

	InformationHandler info;

	/**
	 * Initialie the GUI
	 */
	public GameCreator() {
		info = new InformationHandler();
		info.startGame();
	}

	/**
	 * Prints information to the user about how the games work, and ask for them
	 * to input number of players and player names.
	 * 
	 * @return String playerNames
	 */
	public String[] gameStart() {
		// Show a welcome text
		InformationHandler.showInformation(InputText.information[0], InputText.getButtonText("ok"));
		// Receives the number of players and player names.
		String[] playerNames = getPlayerNames(askNumberOfPlayers());
		// Ads the player to the GUI
		info.addPlayers(playerNames);
		// Show the rules to the player
		InformationHandler.showInformation(InputText.information[3], InputText.getButtonText("ok"));
		// Says that a random player is going to start.
		InformationHandler.showInformation(InputText.information[4], InputText.getButtonText("ok"));
		// Returns the playernames to the caller.
		return playerNames;

	}

	/**
	 * Method that prompts the use to enter how many players are playing
	 * 
	 * @return The number of players that want to play.
	 */
	private int askNumberOfPlayers() {
		// Ask the players how many are playing
		int numbPlayer = 0;
		numbPlayer = InputHandler.AskForInt(InputText.information[1], 2, 6);

		return numbPlayer;
	}

	/**
	 * Method that prompts the users to enter their playernames. It also
	 * prevents them from typing the same names.
	 * 
	 * @param numbPlayer
	 *            The number of players that want to play the game.
	 * @return Player Names.
	 */
	private String[] getPlayerNames(int numbPlayer) {
		String[] playerNames;
		do {
			playerNames = new String[numbPlayer];
			playerNames[0] = InputHandler.AskForString(String.format(InputText.information[2], 1));

		} while (playerNames[0].equals(""));

		for (int i = 1; i < numbPlayer; i++) {
			boolean nameEqual = true;
			playerNames[i] = null;

			while (nameEqual) {
				do {
					playerNames[i] = InputHandler.AskForString(String.format(InputText.information[2], i + 1));

				} while (playerNames[i].equals(""));

				System.out.println("a" + playerNames[i] + "a");
				for (int j = 0; j < i; j++) {
					if (playerNames[j].equals(playerNames[i]) || playerNames[i].equals("")) {
						InformationHandler.showInformation(String.format(InputText.errors[1], playerNames[i]),
								InputText.getButtonText("ok"));
						nameEqual = true;
						break;
					} else {
						nameEqual = false;
					}
				}
			}
		}
		return playerNames;
	}

}
