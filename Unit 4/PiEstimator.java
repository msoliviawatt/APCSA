import java.util.*;
public class PiEstimator 
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many iterations should be used?");
        int iterations = input.nextInt();
        double solution = 1.0;
        double ans = 3.0;

        for(int i = 0; i < iterations; i++)
        {
            solution = solution - (1.0 / ans);
            if(ans < 0)
            {
                ans *= -1;
                ans += 2;
            }
            else
            {
                ans += 2;
                ans *= -1;
            }

        }
            System.out.println("Pi = " + solution * 4);

        input.close();

        
    }
}
