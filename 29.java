import java.util.*;
class triangle
{
    public static void main(String arg[])
    {
        int i, space, rows, k = 0;
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        rows=sc.nextInt();
        for (i = 1; i <= rows; ++i, k = 0) 
        {
            for (space = 1; space <= rows - i; ++space)
            {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) 
            {
                System.out.print("* ");
                ++k;
            }
            System.out.print("\n");
        }
    }
}