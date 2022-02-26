import java.util.*;
public class QuotientAndRemainder 
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        int x, y, r, answer;
        System.out.println("Enter an integer!");
        x = input.nextInt();
        System.out.println("Enter anothther integer!");
        y = input.nextInt();

        if(x >= y)
        {
            r = x % y;
            answer = x / y;
            System.out.println(x + " divided by " + y + " is " + answer + "r" + r);
        }
        else
        {
            r = y % x;
            answer = y / x;
            System.out.println(y + " divided by " + x + " is " + answer + "r" + r);
        }

        input.close();
    }
}
