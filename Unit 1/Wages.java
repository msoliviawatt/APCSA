import java.util.*;
public class Wages
{
    public static void main(String[]arg)
    {
            Scanner input = new Scanner(System.in);
            double regpay, overtimepay, total;
            int reghours, overtimehours;
            System.out.println("HELLO!");
            System.out.println("I am going to ask you some questions about how much you work and how much you get paid!");
            System.out.println("Please do not use '$' when answering about your pay- just enter the value as a decimal. THANKS!");
            System.out.println("When ready, please enter your regular, hourly wage");
            regpay = input.nextDouble();
            System.out.println("How many 'regular' hours have you worked this week?");
            reghours = input.nextInt();
            System.out.println("Lastly, how many overtime hours have you worked this week?");
            overtimehours = input.nextInt();
            overtimepay = 1.5 * regpay * overtimehours;
            total = regpay * reghours + overtimepay;
            System.out.println("OKAY! Your total weekly pay should be: $" + total);
            input.close();
    }
}
