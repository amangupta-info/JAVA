import java.util.*;
class swap
{
    public static void main(String arg[])
    {
        int i,j;
        System.out.print("Enter two Numbers:");
        Scanner sc = new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextInt();
        System.out.println("Before Swapping the number:\nFirst:\t"+i+"\nSecond:\t"+j);
        //Swapping
        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println("After Swapping the number:\nFirst:\t"+i+"\nSecond:\t"+j);
    }
}