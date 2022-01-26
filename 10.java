
import java.util.*;
class Calculator{
	public static void main(String arg[]){
		System.out.println(" Press 1 for Addition\n Press 2 for Subtraction\n Press 3 for Multiplication\n Press 4 for Division\n");
		System.out.print("Enter Your choice : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.print("Enter your First No : ");
		float a = sc.nextFloat();
		System.out.print("Enter your Second No : ");
		float b = sc.nextFloat();
		switch(choice){
			case 1: System.out.println("Addition is : "+(a+b));
				break;
			case 2: System.out.println("Subtraction is : "+(a-b));
				break;			
			case 3: System.out.println("Multiplication is : "+(a*b));
				break;		
			case 4: System.out.println("Division is : "+(a/b));
				break;
		}
	}
}
