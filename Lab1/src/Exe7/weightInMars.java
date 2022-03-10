package Exe7;
import java.util.Scanner; 

public class weightInMars {

	public static double weight;
	public static double mars_weight;
	
	
	public static void main( String[] args )
	{
		System.out.print( "Enter you weight: " );
		Scanner cin = new Scanner(System.in);  // Create a Scanner object
	    weight = cin.nextInt();
	    mars_weight = weight * 37.83 / 100;
	    System.out.println("\nYour weight on:");
	    System.out.println("Earth is " + weight);
	    System.out.println("Mars is " + mars_weight);
	}
	
}
