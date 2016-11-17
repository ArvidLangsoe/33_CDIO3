package boundary_entity;

public class GameText {
	
	/**
	 * The method  returns a String of the field title.
	 * @param field name.
	 * @return String
	 */
	public static String[] fieldTitles={
/*(001)*/	"Tribe Encampment",
/*(002)*/	"Crater",
/*(003)*/	"Mountain",
/*(004)*/	"Cold Desert",
/*(005)*/	"Black cave",
/*(006)*/	"The Werewall",
/*(007)*/	"Mountain village",
/*(008)*/	"South Citadel",
/*(009)*/	"Palace gates",
/*(010)*/	"Tower",
/*(011)*/	"Castle",
/*(012)*/	"Walled city",
/*(013)*/	"Monastery",
/*(014)*/	"Huts in the  mountain",
/*(015)*/	"The pit",
/*(016)*/	"Goldmine",
/*(017)*/	"Caravan",
/*(018)*/	"Second Sail",
/*(019)*/	"Sea Grover",
/*(020)*/	"The Buccaneers",
/*(021)*/	"Privateer armade"};
	
	/**
	 * The method  returns a String of the button text.
	 * @param button name.
	 * @return String
	 */
	public static String[] fieldSubText={
/*(101)*/	"1000",
/*(102)*/	"1500",
/*(103)*/	"2000",
/*(104)*/	"3000",
/*(105)*/	"4000",
/*(106)*/	"4300",
/*(107)*/	"4750",
/*(108)*/	"5000",
/*(109)*/	"5500",
/*(110)*/	"6000",
/*(111)*/	"8000",
/*(112)*/	"+5000",
/*(113)*/	"+500",
/*(114)*/	"2500",
/*(115)*/	"2500",
/*(116)*/	"-2000(tax)",
/*(117)*/	"-4000(tax)",
/*(118)*/	"4000",
/*(119)*/	"4000",
/*(120)*/	"4000",
/*(121)*/	"4000"};
	
	/**
	 * The method  returns a String of the field description.
	 * @param description name.
	 * @return String
	 */
	public static String[] fieldShortDescription={
/*(201)*/	"Tribe Encampment has a price of 1000, and a rent of 100",
/*(202)*/	"Crater has a price of 1500, and a rent of 300",
/*(203)*/	"Mountain has a price of 2000, and a rent of 500",
/*(204)*/	"Cold Desert has a price of 3000, and a rent of 700",
/*(205)*/	"Black Cave has a price of 4000, and a rent of 1000",
/*(206)*/	"The Werewall has a price of 4300, and a rent of 1300",
/*(207)*/	"Crater has a price of 4750, and a rent of 1600",
/*(208)*/	"South Citadel has a price of 5000, and a rent of 2000",
/*(209)*/	"Palace gates has a price of 5500, and a rent of 2600",
/*(210)*/	"Tower has a price of 6000, and a rent of 3200",
/*(211)*/	"Castle has a price of 8000, and a rent of 4000",
/*(212)*/	"When you land on the Walled city you receive a bonus of 5000",
/*(213)*/	"When you land on the Monastery you receive a bonus of 500",
/*(214)*/	"Huts in the mountain is labor camp. Roll the dice and pay 100 times what you roll.",
/*(215)*/	"The pit is labor camp. Roll the dice and pay 100 times what you roll.",
/*(216)*/	"If you land on the Goldmine you have to pay 2000 or 10% og your fortune to the owner.",
/*(217)*/	"If you land on the Caravan you have to pay 4000 or 10% og your fortune to the owner.",
/*(218)*/	"When you land on Second sail you have to pay between 500-400 in rent, dependent on how many fleets the owner has.",
/*(219)*/	"When you land on Sea Grover you have to pay between 500-400 in rent, dependent on how many fleets the owner has.",
/*(220)*/	"When you land on The Buccaneers you have to pay between 500-400 in rent, dependent on how many fleets the owner has.",
/*(221)*/	"When you land on Privateer armade you have to pay between 500-400 in rent, dependent on how many fleets the owner has."};

	//####################################################################################
	// Begin game texts
	//####################################################################################

	
	
	/**
	 * The method welcomeText returns a string which contains the welcome text of the game.
	 * @return String
	 */
	public static String welcomeText()
	{	
		return "Welcome to 'Rodatam' \n";
	}
	
	/**
	 * The method PlayerNumberText returns a string which tells you player number.
	 * @return String
	 */
	public static String playerNumberText()
	{
		return "Enter the number of players who wants to play.\n";
	}
	
	/**

	 * The method invalidPlayerNumberText returns a string which tells the player number is invalid.
	 * @return String
	 */
	public static String invalidPlayerNumberText()

	{
		return "This is not a valid number of players, please try again with a number within 2-6 \n";
	}
	
	/**
	 * The method invalidInputText returns a String that tells you that the input was wrong.
	 * @return String
	 */
	public static String invalidInputText()
	{
		return "This is not a valid input. Please try again \n";
	}
	
	/**
	 * The method enterPlayerNames returns a string Which asks the players to enter their names.
	 * @param  The number of the player
	 * @return String
	 */	
	public static String enterPlayerNameText(int number)
	{
		return "Please enter the name of player " + number+"\n";
	}
	
	/**
	 * The method playerNameTakenText returns a String which tells the name is taken.
	 * @param playerName.
	 * @return String
	 */
	public static String playerNameTakenText(String playerName)
	{
		return "This player name "+ playerName +" is already taken, try again \n";
	}
	
	/**
	 * The method gameRules returns a string which contains the game rules.
	 * @return String
	 */
	public static String gameRulesText()
	{
		String gameRules = "";
		gameRules = "The game rules are as follows: \n";
		gameRules = gameRules 
			      + "- All players start with 30000 money. \n"
				  + "- When you lose all your money you are out of the game. \n"
				  + "- The last remaining player has won the game.\n"
				  + "- You start a turn by rolling the dice. You then move forward by the amount you rolled.\n"
				  + "- There are 5 different types of fields.\n"  
				  + "- ";
			
		return gameRules;
	}
	
	/**
	 * The method firstTurn returns a string which contains which player has 
	 * been randomly selected to start the game. 
	 * @param playerName The name of the player
	 * @return String
	 */
	public static String firstTurnText()
	{
		return "A player has been randomly selected to start the game. \n"; 
	}
	
	//####################################################################################
	// On going game texts
	//####################################################################################

	
	
	/**
	 * The method turn returns a string which contains whose turn it is.
	 * @param playerName The name of the player
	 * @return String
	 */
	public static String turnText(String playerName)
	{
		return "It is " + playerName + "'s turn \n";
	}
	
	/**
	 * The method rollText returns a String which contains what a particular player has rolled with the dice.
	 * @param playerName The name of the player (String).
	 * @param value A array of two dice values (Int[])
	 * @return String 
	 */
	public static String rollText(String playerName, int[] value)
	{
		return playerName + " has rolled a " + value[0] + " and a " + value[1] + "."+ "\n";
	}
	
	//####################################################################################
	//Field buying texts
	//####################################################################################

	
	
	/**
	 * The method buyfieldText returns a String which asks if you want to buy a field.
	 * @param playerName The name of the player. 
	 * @param fieldName of the mattering field.
	 * @param price(int) of the mattering field.
	 * @return String
	 */
	public static String buyfieldText(String playerName, String fieldName, String price)
	{
		return "Do you, " + playerName + ", want to buy "+ fieldName +" for "+ price +"? \n";
	}
	
	/**
	 * The method cantBuyFieldText returns a String that tells you that you can't afford this field.
	 * @param playerName The name of the player.
	 * @param fieldName of the mattering field.
	 * @return String
	 */
	public static String cantBuyFieldText(String fieldName)
	{
		return "You can't afford to buy "+ fieldName +". \n";
	}
		
	/**
	 * The method boughtFieldText returns a String which tells you that you bought the field.
	 * @param plyerName.
	 * @param fieldName.
	 * @return String
	 */
	public static String boughtFieldText(String playerName, String fieldName)
	{
		return "Congratulation "+ playerName +" bought " + fieldName +" \n" ;
	}	
	
	//####################################################################################
	//Land on field texts
	//####################################################################################

	
	
	/**
	 * The method refugeText returns a String which tells you, you landed on a refuge field.
	 * @param plyerName The name of the player.
	 * @param fieldName The name of the field.
	 * @param amount The amount the player will receive on this field.
	 * @return String
	 */
	public static String refugeText(String playerName, String fieldName, int amount)
	{
		return playerName +" landed on " + fieldName + " this is a Refuge field, and you will now recive "+ amount +"  \n" ;
	}
	
	/**
	 * The method taxText returns a String which tells you, landed on a tax field.
	 * @param plyerName The name of the player.
	 * @param fieldName The name of the field.
	 * @param tax The tax of the field.
	 * @return String
	 */
	public static String taxText(String playerName, String fieldName, int tax)
	{
		return playerName +" landed on " + fieldName + " you will have to pay tax, you can choose to pay "+ tax +" or pay 10% of your fortune \n";
	}
		
	/**
	 * The method ownedFieldText returns a String which tells you that you landed on a owned field.
	 * @param plyerName The name of the player.
	 * @param fieldName The name of the field.
	 * @param rent The rent of the field.
	 * @return String
	 */
	public static String landOnFieldText(String playerName, String fieldName)
	{
		return playerName + " landed on "+fieldName+" \n";
	}
	
	/**
	 * The method fieldNotOwnedText returns a String which tells you, you landed on a owned field.
	 * @param fieldType The type of the field.
	 * @param fieldName The name of the field.
	 * @return String
	 */
	public static String fieldNotOwnedText(String fieldType,String fieldName)
	{
		return fieldName+" is a "+fieldType+". \n";
	}
	
	//####################################################################################
	//Pay rent to owner texts
	//####################################################################################

	
	
	/**
	 * The method ownedFieldText returns a String which tells you that you landed on a owned field, with a switchcase depending on what filed your on.
	 * @param plyerName The name of the player.
	 * @param fieldName The name of the field.
	 * @param fieldOwner The owner of the field.
	 * @param rent The rent of the field.
	 * @return String
	 */
	public static String ownedFieldText(String playerName,String fieldType,String fieldOwner,int rent)
	{
		String out=fieldOwner+" owns this field. This field is a "+fieldType+"\n";
		switch(fieldType){
		case "Territory":
			out+="You now have to pay "+rent+" to "+fieldOwner+".\n";
			break;
		case "Fleet":
			out+="You now have to pay "+rent+" to "+fieldOwner+". Because of how many fleets they have.\n";
			break;
		case "Labor Camp":
			out+="You now have to to roll the dice and pay a hundred times the amount you roll to "+fieldOwner+". You have to pay twice that if "+fieldOwner+" has two labor camps.\n";
			break;
		}
		return out;		
	}	
	
	/**
	 * The method lostText returns a String which tells you that you lost.
	 * @param playerName The name of the player.
	 * @param rent the rent of the laborcamp .
	 * @return String
	 */
	public static String ownedLaborCampAfterRoll(String fieldOwner,int rent){
		return "You now have to pay "+ rent+" to "+fieldOwner+".\n";
	}
	
	//####################################################################################
	//End game Text
	//####################################################################################

	
	
	/**
	 * The method lostText returns a String which tells you that you lost.
	 * @param playerName The name of the player.
	 * @return String
	 */
	public static String lostText(String playerName)
	{
		return playerName + " lost and is out of this game, like the rest of the world #Trump \n";
	}		
	
	/**
	 * The method winnerText returns a String which contains which player has won the game
	 * @param playerName The name of the player.
	 * @return String
	 */
	public static String winnerText(String playerName)
	{
		return "Congratulations " + playerName + " has won the game! \n";
	}
	
	//####################################################################################
	//Misc. methods
	//####################################################################################
	
	
	
	/**
	 * The method getButtonText returns a String of the button text.
	 * @param button name.
	 * @return String
	 */
	public static String getButtonText(String m)
	{
		switch(m)
		{
		case "yes":
			return "Yes";
		case "no":
			return "No";
		case "10%":
			return "10%";
		case "int":
			return "int";
		case "ok":
			return "OK";
		}
		return "BUTTON ERROR";
	}
	
	
}
