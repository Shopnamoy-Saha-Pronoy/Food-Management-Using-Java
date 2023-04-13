import java.lang.*;

public class Pizza extends FoodItem
{
	private String size;
	
	public Pizza()
	{
		System.out.println("Empty-Pizza");
	}
    public Pizza(String size, double price, String name)
	{
		super(price,name);
		System.out.println("Para-Pizza");
		this.size = size;
	}
  public void showDetails()
	{
		System.out.println("Name="+name);
		System.out.println("price="+price);
		System.out.println("size="+size);
	}
	
}