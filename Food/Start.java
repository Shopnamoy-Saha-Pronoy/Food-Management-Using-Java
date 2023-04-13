import java.lang.*;

public class Start
{
	public static void main(String arg[])
{
	Pizza p1 = new Pizza("Midium",250.75,"chiken chesse");
	p1.showDetails();
	
	System.out.println();
	
	Burger b1 = new Burger(3,160.75,"BBQ");
	b1.showDetails();
}


}