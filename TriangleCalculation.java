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
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the lengths of side 1, side 2 and side 3");

		s1 = keyboard.nextInt();
		s2 = keyboard.nextInt();
		s3 = keyboard.nextInt();

			if ((s1 > 0) && (s2 > 0) && (s3 > 0))
				{
					if (s1 != s2)
						{
							if (s2 != s3)
							System.out.println("The triangle is scalene.");
							if (s2 == s3)
							System.out.println("The triangle is isoceles.");
						}
					if (s1 == s2)
						{
							if (s2 != s3)
							System.out.println("The triangle is isoceles.");
							if (s2 == s3)
							System.out.println("The triangle is equilateral");
						}
				}
			else
			System.out.println("Error! Sides can not equal 0.");


	}
}
