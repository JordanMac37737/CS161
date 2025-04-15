package CS161;

import java.util.Scanner;

public class A2Q1 {

	public static void main(String args[]) {
Scanner in = new Scanner (System.in);
	
System.out.println("enter a loating-point number: ");
double i = in.nextDouble();
	
String abs = "";
if (Math.abs(i)<1.0)

{
abs = "small";
}

if(Math.abs(i)>1000000)
{
	abs = "large";
}

if (i == 0)
{
	System.out.println("Zero");
}

if (i > 0)
{
	System.out.println(abs + " positive number ");
}
if (i < 0)
{
	System.out.println(abs + " negative number ");
}
	}
}