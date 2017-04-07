package pl.kriss3.bcit.comp1451;


/**
 * Main runner class, Starting point
 * @author Krzysztof Szczurowski
 * @since 2017-04-07 
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class04_Lab02_Home.git
 */
public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Class 04 Lab02 Home Lab => BankAccount UnitTest using JUnit");
		run();
	}
	
	private static void run()
	{
		Helper helper = new Helper();
		helper.printMessage();
	}
	
}
