//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		System.out.println(Math.sqrt(Math.pow(5-0,2)+Math.pow(5-0,2)));
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven sooe = new StringOddOrEven();
		System.out.println("Type a string to be evaluated for eveness::");
		sooe.setString(keyboard.nextLine());
	    System.out.println(sooe.isEven());
	}
}