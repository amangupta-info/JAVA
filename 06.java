import java.util.*;
class NetSal{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary: ");
		int sal=sc.nextInt();
		int HRA,DA,Netsal;
		if(sal<20000){
			HRA = (sal*10)/100;
			DA = (sal*12)/100;
			Netsal = sal + HRA + DA;
			System.out.println("Net Salary : "+Netsal);
		}
		else{
			HRA = (sal*10)/100;
			DA = (sal*8)/100;
			Netsal = sal + HRA + DA;
			System.out.println("Net Salary : "+Netsal);
		}
	}
}