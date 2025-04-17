package CS161;

import java.util.Scanner;

public class A2Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("enter a positive/negative number: ");
		double i = in.nextDouble();
		
		if (i < 0)

		{ System.out.println("negative number"); }		
	
		if (i > 0)
		
		{System.out.println("positive number");}
	}
}
