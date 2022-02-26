import java.util.*;

public class ChangeConverter
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount of change in cents:");
        int change, quart, dime, nick, penn;
        change = input.nextInt();

        quart = change / 25;
        change = change % 25;
        dime = change / 10;
        change = change % 10;
        nick = change  / 5;
        change = change % 5;
        penn = change; 
        System.out.println("Quarters: " + quart);
        System.out.println("Dimes: " + dime);
        System.out.println("Nickles: " + nick);
        System.out.println("Pennies: " + penn);
        input.close();
    }
}
