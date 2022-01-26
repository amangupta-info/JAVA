import java.util.*;
class AreaofCircle{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius : ");
		float r = sc.nextFloat();
		double area = Math.PI*(r*r);// Math.PI is the Double constant
		System.out.print("Area is "+area);
	}
}