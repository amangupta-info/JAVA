import java.util.*;
class leap
{
    public static void main(String arg[])
    {
        int y;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year:");
        y=sc.nextInt();
        if(y%4==0)
        {
            System.out.println("Leap year:"+y);
        }
        else
        {
            System.out.println("It's not Leap year");
        }
    }
}