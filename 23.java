import java.util.*;
class Daytomonth{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of days : ");
		int days = sc.nextInt();
		//Assumming no of days in a month is 30
		if(days<=365){
			int month = days/30;
			int rdays = days%30;
			System.out.println(month+" Month & "+rdays+" Days");
		}
		else
			System.out.println("Please Enter days less than 365");
	}
}