import java.util.*;
class oper
{
    public static void main(String arg[])
    {
        int i,j,k,l;
        System.out.print("Enter the number for Increment & Decrement:");
        Scanner sc= new Scanner(System.in);
        i=sc.nextInt();
        j=i;
        System.out.println("Prefix-Increment:"+ ++i);
        System.out.println("Prefix-Decrement:"+ --j);
        System.out.println("Postfix-Increment:"+ i++);
        System.out.println("Postfix-Decrement:"+ j--);


    }
}