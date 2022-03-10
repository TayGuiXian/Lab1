package Exe8;
import java.util.Scanner;
import Exe7.weightInMars;

public class storeData {
	
	private static double earth[] = new double[100000];
	private static double mars[] = new double[100000];
	private static int count = 0;

	
	public static void main( String[] args )
	{
		for (int i = 0 ; i < count ; i++)
		System.out.print( i + ". Earth: " + earth[i] + "   Mars: " + mars[i] +"\n");
		System.out.println("");
		weightInMars.themain();
		count++;
		earth[count-1] = weightInMars.weight;
		mars[count-1] = weightInMars.mars_weight;
		System.out.println("\n");
		main(null);
	}
}
