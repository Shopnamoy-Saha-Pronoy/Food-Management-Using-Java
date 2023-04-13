import java.lang.*;

public class FoodItem
{
	double price;
    String name;
	
	public FoodItem()
	{
		System.out.println("Empty-FoodItem");
	}
	public FoodItem(double price, String name)
	{
		System.out.println("Para-FoodItem");
		this.price = price;
		this.name = name;
	}
	public void showDetails()
	{
		System.out.println("Name="+name);
		System.out.println("price="+price);
	}
}