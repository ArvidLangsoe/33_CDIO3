package entity.fields;

import entity.Player;

public class Tax extends Field
{
	//Instance variables
	private int taxRate;
	private int taxAmount;
	
	/**
	 * Object Tax constructor
	 * @param type The type of the field
	 * @param taxAmount The fixed tax amount the player can choose to pay.
	 * @param taxRate The tax rate the player can choose to pay. The taxRate is in percent
	 */
	public Tax (String type, int taxAmount, int taxRate)
	{	
		super(type);
		this.taxAmount = taxAmount;
		this.taxRate = taxRate;
	}
	
	/**
	 * Method landOnField decides what to be done when player lands on a Tax Field.
	 * @param player The player to land on the tax field.
	 */
	@Override
	public void landOnField(Player player)
	{
		if (player.getPlayerPayDecision()) //Checks if the player wants to pay taxrate or fixed taxAmount. True if he wants to pay taxRate
		{
			int rent = (int)(0.01 * taxRate * player.getPlayerFortune()); //The rent to be paid
			player.changeAccountBalance(-rent);						  //Subtracts the rent from the balance of the player.
		}
		else
		{
			player.changeAccountBalance(-taxAmount);                  //Subtracts the rent from the balance of the player.
		}
	}
	/**
	 * Method getTaxAmount returns the taxAmount to be paid by the player who lands on the tax field.
	 * @return Returns the taxAmount to be paid.
	 */
	public int getTaxAmount()
	{
		return taxAmount;
	}
	
	/**
	 * Method getTaxRate returns taxRate to be paid by the player who lands on the tax field.
	 * @return Returns the taxRate to be paid.
	 */
	public int getTaxRate()
	{
		return taxRate;
	}
	
	
	/**
	 * Method getRent is not used.
	 * The getRent has to be implemented because the super class has the abstract method getRent().
	 */
	@Override
	public int getRent(){
		return -1;
	}
}
