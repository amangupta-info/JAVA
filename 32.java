import java.util.*;
class prime
{
    public static void main(String arg[])
    {
        int a, b, i, j, flag;
        System.out.print("Enter lower bound of the interval: ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.print("\nEnter upper bound of the interval: ");
        b=sc.nextInt();
        System.out.println("\nPrime numbers between "+a+" and "+b+" are: ");
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
               continue;
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i+"");
        }
    }
}