import java.util.Scanner;  
class DigitalSum{  
public static void main(String args[]){  
	int number, digit, sum = 0,product = 1,n;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the number: ");  
	number = sc.nextInt();  
	n=number;
while(number > 0){     
	digit = number % 10;   
	sum = sum + digit;   
	number = number / 10;  
} 
System.out.println("Sum of Digits: "+sum);   

		while (n != 0) {
			product = product * (n % 10);
			n = n / 10;
		}
  System.out.println("Product of Digits: "+product);
}  
}  