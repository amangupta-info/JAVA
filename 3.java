import java.util.*;
class comp
{
    public static void main(String arg[])
    {
        int i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your First Numbers:");
        i=sc.nextInt();
        System.out.println("Enter Your Second Numbers:");
        j=sc.nextInt();
        if(i>j)
        {
            System.out.println(i+" greater than "+j);
        }
        else
        {
            System.out.println(j+" greater than "+i);
        }
    }
}