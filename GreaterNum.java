package Day5Programs;

import java.util.Scanner;

public class GreaterNum 
{
	public static void main(String[] args) 
	{
		int x,y,z;
		Scanner input=new Scanner(System.in);
		System.out.println("enter first number");
		x=input.nextInt();
		System.out.println("enter second number");
		y=input.nextInt();
		System.out.println("enter Third number");
		z=input.nextInt();
		input.close();
		if(x>y && x>z)
		{
			System.out.println("Largest number is "+x);
		
		}
		else if(y>z)
		{
			System.out.println("Largest number is " +y);
		}
		else
		{
			System.out.println("largest number is " +z);
		}
		
	}

}
