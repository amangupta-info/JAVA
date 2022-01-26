import java.util.Scanner;	
import java.lang.*;

class Harmonic{

	public static void main(String args[]) {
	  Scanner in = new Scanner(System.in); 
	  System.out.println("Generates Harmonic Series");
	  System.out.println("---------------------------");
	  System.out.print("Enter Number: ");
	  int number = in.nextInt(); 
	  String strSeries = "1";
	  for(int temp = 2;temp <= number; temp++){
		  strSeries += "+(1/"+temp+")";	 
	  }
	  System.out.println("Harmonic Series:");
	  System.out.println(strSeries);
	}
 } 
