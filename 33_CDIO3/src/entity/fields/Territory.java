package entity.fields;

public class Territory extends Ownable 
{
	//Instance variables
	private int rent;
	
	/**
	 * Object Territory constructor
	 * @param type The type of the territory field
	 * @param price The price of the territory field
	 * @param rent The rent it costs to land on the territory field if the field is owned.
	 */
	public Territory(String type, int price, int rent)
	{
		super(type, price);
		this.rent = rent;
	}
	
	/**
	 * The method getRent returns the rent to be paid by the player who lands on the territory field.
	 * @return Returns the rent to be paid.
	 */
	@Override
	public int getRent()
	{
		return rent;
	}
}
