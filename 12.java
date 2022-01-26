import java.util.*;
class Factorial2{
	static int fact(int n){
		if(n==0)
			return 1;
		else
			return(n*fact(n-1));
	}
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to find Factorial : ");
		int n = sc.nextInt();
		int f= fact(n);
		System.out.println("Factorial : "+f);
	}
}