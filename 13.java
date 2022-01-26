import java.util.*;
class elif
{
    public static void main(String arg[])
    {
        int i,j,k;
        System.out.print("Enter three Number:");
        Scanner sc= new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextInt();
        k=sc.nextInt();
        if(i>j)
        {
            if(i>k)
            {
                System.out.println(i+" greater than both number");
            }
            else if(i==k)
            {
                System.out.println(i+" greater than "+j+" but equal to "+k);
            }
            else
            {
                System.out.println(i+" greater than "+k+" but less than "+j);
            }
        }
        else if(j>k)
        {
            if(j>i)
            {
                System.out.println(j+" greater than both number");
            }
            else if(j==i)
            {
                System.out.println(j+" greater than "+k+" but equal to "+i);
            }
            else
            {
                System.out.println(j+" greater than "+i+" but less than "+k);
            }
        }
        else if(k>i)
        {
            if(k>j)
            {
                System.out.println(k+" greater than both number");
            }
            else if(k==i)
            {
                System.out.println(k+" greater than "+i+" but equal to "+j);
            }
            else
            {
                System.out.println(k+" greater than "+j+" but less than "+i);
            }
        }
        else
        {
            System.out.println("All the number are equals");
        }

    }
}