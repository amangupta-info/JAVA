class bitw
{
    /*int and(int x,int y)
    {
        return (x&y);
    }*/
    int vec(int a,int b)
    {
        return (a^b);
    }
    /*public static void main(String arg[])
    {
        bitw m = new bitw();
        System.out.println("x & y = "+m.and(9,8));
    }*/
    public static void main(String args[])
    {
        bitw n = new bitw();
        System.out.println("a ^ b = "+n.vec(5,4));
    }
}