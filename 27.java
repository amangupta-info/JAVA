import java.util.*;
class piramid
{
    public static void main(String arg[])
    {
        int i,j,row,number=1;
        System.out.print("Enter the number of rows:");//rows=4
        Scanner sc = new Scanner(System.in);
        row=sc.nextInt();
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=i;++j)
            {
                System.out.print(""+number);
                ++number;
            }
            System.out.print("\n");
        }
    }
}