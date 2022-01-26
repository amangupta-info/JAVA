import java.util.*;
import java.util.Scanner;
public class palidrome30
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the minimum value of the range:");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.print("Enter the maximum value of the range:");
        int max = sc.nextInt();
        printPal(min, max);
    }
    private static boolean isPalindrome(int num) 
    {
        int reverse = 0;
        for (int i = num; i > 0; i /= 10)
            reverse = reverse * 10 + i % 10;
        return num == reverse;
    }
    static void printPal(int min, int max)
    {
        for (int i = min; i <= max; i++)
        if (isPalindrome(i))
            System.out.print(i + " ");
    }
}