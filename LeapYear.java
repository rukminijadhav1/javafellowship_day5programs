package Day5Programs;

import java.util.Scanner;

public class LeapYear 
{	
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
		
		System.out.println("enter year");
		int n=input.nextInt();
		input.close();
		
		 if (((n % 4 == 0) && (n % 100!= 0)) || (n%400 == 0))
			 System.out.println("leap year");
		 else
			 System.out.println("not leap year");
	}

}
