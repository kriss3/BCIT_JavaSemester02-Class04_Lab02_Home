package pl.kriss3.bcit.comp1451;

public class Helper 
{
	public String printMessage()
	{
		return String.format("This is a test method from class: %s", this.getClass().getSimpleName());
	}
}
