import java.lang.*;

public class Burger extends FoodItem
{
	private int numberOfPatties;
	
	public Burger()
	{
		System.out.println("Empty-Burger");
	}
    public Burger(int numberOfPatties, double price, String name)

	{
		super(price,name);
		System.out.println("Para-Burger");
		this.numberOfPatties = numberOfPatties;
	}

	public void showDetails()
	{
		System.out.println("Name="+name);
		System.out.println("price="+price);
		System.out.println("numberOfPatties="+numberOfPatties);
		
	}
}