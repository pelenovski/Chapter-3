<<<<<<< HEAD
//Pane Elenovski
//9/18/2017
//Leap Year Calculator
//Asks user for year input and tells if leap year or not
import java.util.Scanner;

public class LeapYearCalculator
{
	public static void main (String []args)
	{
		int year;
		Scanner keyboard = new Scanner(System.in);
		//Asks user to input a year
		System.out.println("Enter a year buddy: ");

		year = keyboard.nextInt();
		//Checks to see if year is greater than or equal to 1582
		if (year >= 1582)
		{
			if ((year % 400 == 0)||((year % 4 == 0) && (year % 100 !=0)))
			System.out.println(year + " is a leap year");
			else
			System.out.println(year + " is not a leap year");
		}
		else
		System.out.println("ERROR! Year must be 1582 or greater.");








	}
}
=======
//Pane Elenovski
//9/18/2017
//Leap Year Calculator
//Asks user for year input and tells if leap year or not
import java.util.Scanner;

public class LeapYearCalculator
{
	public static void main (String []args)
	{
		int year;
		Scanner keyboard = new Scanner(System.in);
		//Asks user to input a year
		System.out.println("Enter a year buddy: ");

		year = keyboard.nextInt();
		//Checks to see if year is greater than or equal to 1582
		if (year >= 1582)
		{

			if ((year % 400 == 0)||((year % 4 == 0) && (year % 100 !=0)))
			System.out.println(year + " is a leap year");
			else
			System.out.println(year + " is not a leap year");
		}
		else
		System.out.println("ERROR! Year must be 1582 or greater.");








	}
}
>>>>>>> 55d2599386d70b0bd0a84b67e3c2a55fade4ed76
