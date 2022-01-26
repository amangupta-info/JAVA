import java.util.*;
class fact
{
    public static void main(String arg[])
    {
        int i,f=1,number;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        number=sc.nextInt();
        for(i=1;i<=number;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial Of "+number+" is: "+f);
    }
}