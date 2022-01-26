import java.util.*;
class VectorDE
{
    public static void main(String s[])
    {
        Vector<String> V = new Vector<String>(4);
        System.out.println("Size is "+V.size());
        System.out.println("Capacity is"+V.capacity());
        V.add("Tiger");
        V.add("Lion");
        V.add("Dog");
        V.add("Elephant");
        if(V.contains("Tiger"))
        {
            System.out.println("Tiger is present at the index"+V.indexOf("Tiger"));
        }
        else
        {
            System.out.println("Tiger is not present in the list");
        }
        //get the first element
        System.out.println("The first animal of the vector is="+V.firstElement());
        //get the last element
        System.out.println("The last animal of the vector is="+V.lastElement());
    }
}