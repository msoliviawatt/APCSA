import java.util.*;
public class PopulationGrowth
{
    public static void main(String [] arg)
    {
        Scanner input = new Scanner(System.in);
        int orgs, rate, ratehrs, hrs, hours;
        System.out.println("How many organisms are there?");
        orgs = input.nextInt();
        System.out.println("What is the growth rate?");
        rate = input.nextInt();
        System.out.println("How many hours does it take to acheive this rate?");
        ratehrs = input.nextInt();
        System.out.println("For how many hours does the population grow?");
        hrs = input.nextInt();
        hours = hrs;
        while(hrs >= ratehrs)
        {
            orgs = orgs * rate;
            hrs -= ratehrs;
        } 
        double x = (double)hrs / (double)ratehrs;
        if(hrs > 0)
        {
            orgs = orgs + (int)(x * orgs);
        }

        System.out.println("The total population after " + hours + " hours is predicted to be " + orgs);

        input.close();
    }
}