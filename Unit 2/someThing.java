public class someThing
{
    public static void main(String[]arg)
    {
        int x = 10;
        int y = 20;
        System.out.println(x + " " + y);
        swap(x, y);
        System.out.println(x + " " + y);
    }
    public static void swap(int p, int q)
    {
        int temp = p;
        p = q;
        q = temp;
    }
}
