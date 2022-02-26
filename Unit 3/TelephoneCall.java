import java.util.*;
public class TelephoneCall 
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        int minutes, additionalMinutes;
        double total;
        System.out.println("How long was your call (in minutes)?");
        minutes = input.nextInt();

        if(minutes <= 2)
        {
            total = 1.15;
            System.out.println("The total cost of your call is: $" + total);
        }
        else
        {
            additionalMinutes = minutes - 2;
            double extraCost = additionalMinutes * 0.50;
            total = 1.15 + extraCost;
            System.out.println("The total cost of your call is: $" + total);

        }

        input.close();
    }
}
