package entity.fields;

import entity.Player;

public class Refuge extends Field 
{
	//Instance variables
	private int bonus;

	/**
	 * Object refuge constructor
	 * @param fieldName The name of the refuge field
	 * @param bonus The bonus that the refuge field gives.
	 */
	public Refuge(String fieldName, int bonus)
	{
		super(fieldName);
		this.bonus = bonus;
	}
	
	/**
	 * Method getBonus returns the bonus that the refuge field gives.
	 * @return Returns bonus.
	 */
	public int getBonus() 
	{
		return bonus;
	}
	
	/**
	 * Method landOnField decides what to be done when player lands on a refuge Field.
	 * @param player The player to land on the field.
	 */
	@Override
	public void landOnField(Player player)
	{
		player.changeAccountBalance(bonus); //Gives the player a bonus to his balance.
		player.changePlayerFortune(bonus);  //Updates the players fortune.         
	}
	
	/**
	 * Method getRent() is not used. Added because field is field is abstract.
	 */
	@Override
	public int getRent(){
		return -1;
	}
	
}

