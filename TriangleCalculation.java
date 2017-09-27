<<<<<<< HEAD
//Pane Elenovski
//9/22/2017
//Triangle Program
//Enter sides and informs user on triangle type

import java.util.Scanner;

public class TriangleCalculation
{
	public static void main(String []args)
	{
		//Initiates the variables needed in program
		int s1,s2,s3;
		char choice;
		Scanner keyboard = new Scanner(System.in);

		{
			System.out.print("Please enter the lengths of side 1, side 2 and side 3");

			s1 = keyboard.nextInt();
			s2 = keyboard.nextInt();
			s3 = keyboard.nextInt();

			if


		}














	}
}
=======
//Pane Elenovski
//9/22/2017
//Triangle Program
//Enter sides and informs user on triangle type

import java.util.Scanner;

public class TriangleCalculation
{
	public static void main(String []args)
	{
		//Initiates the variables needed in program
		int s1,s2,s3;
		char choice;
		Scanner keyboard = new Scanner(System.in);

		//Asks user for option between sides or angles
		System.out.print("Would you like to enter the angles or the sides (A for angles, S for sides)");

		choice = Scanner.next().	CharAt();

		if (choice == 'S')
		{
			System.out.print("Please enter the lengths of side 1, side 2 and side 3");

			s1 = keyboard.nextInt();
			s2 = keyboard.nextInt();
			s3 = keyboard.nextInt();


		}














	}
}
>>>>>>> 55d2599386d70b0bd0a84b67e3c2a55fade4ed76
