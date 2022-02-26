import java.util.*;
public class SecondArrayLab 
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);

        int ncount = 0;
        int ecount = 0;
        int ocount = 0;
        int [] neg = new int[10];
        int [] even = new int[10];
        int [] odd = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.println("Enter an integer!");
            int x = input.nextInt();
            if(x < 0)
            {
                neg[ncount] = x;
                ncount++;
            }
            if(x % 2 == 0)
            {
                even[ecount] = x;
                ecount++;
            }
            if(x % 2 != 0)
            {
                odd[ocount] = x;
                ocount++;
            }
        }
        System.out.print("Evens: ");
        for(int i = 0; i < ecount; i++)
        {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.print("Odds: ");
        for(int i = 0; i < ocount; i++)
        {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        
        System.out.print("Negatives: ");
        for(int i = 0; i < ncount; i++)
        {
            System.out.print(neg[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}
