import java.util.*;
class Greetings{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Marks in percent : ");
		int n = sc.nextInt(); 
			if((n>90)&&(n<100))
				System.out.println("Congratulations You have a Excellent Result ");
			else if((n>80)&&(n<90))
				System.out.println("Congratulations You have a Great Result");
			else if((n>60)&&(n<80))
				System.out.println("Congratulations You have a Good Result");
			else
				System.out.println("You Can Score Better Keep Practicing!!");
	
	}
}