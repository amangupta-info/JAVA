import java.util.*;
class fibo
{
    public static void main(String arg[])
    {
        int i,number,n1=0,n2=1,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of elements:");
        number=sc.nextInt();
        System.out.println(n1+"\n"+n2);
        for(i=2;i<number;++i)
        {
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }
    }
}