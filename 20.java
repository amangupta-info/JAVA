import java.util.*;
import java.util.Scanner;
class CONCATE
{
    public static void main(String[] args) {
        String str1,str2;
        System.out.print("Enter first Name:");
        Scanner sc = new Scanner(System.in);
        str1=sc.nextLine();
        System.out.print("Enter Second Name:");
        str2=sc.nextLine();
        int n1 = str1.length();
        int n2 = str2.length();
        char[] chr = new char[n1+n2];
        int ind = 0;
        for(int i=0;i<n1;i++)
        {
            chr[ind] = 0;
            chr[ind++] = str1.charAt(i);
        }
        for(int i=0;i<n2;i++)
        {
            chr[ind] = 0;
            chr[ind++] = str2.charAt(i);
        }
        String str = String.valueOf(chr);
        System.out.println(str);
    }
}