import java.util.*;
public class PowersOfTwo
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive exponent for base 2!");
        int exponent;
        exponent = input.nextInt();
        System.out.println("2^" + exponent + " = " + (int)Math.pow(2, exponent));
        System.out.println("Please enter the next exponent (-1 to quit)");
        exponent = input.nextInt();
        while(exponent != -1)
        {
            while(exponent < -1)
            {
                System.out.println("That is not a valid exponent for this program. Please use a positive integer");
                exponent = input.nextInt();
            }
            System.out.println("2^" + exponent + " = " + (int)Math.pow(2, exponent)); 
            System.out.println("Please enter the next exponent (-1 to quit)");
            exponent = input.nextInt();
        }
        System.out.println("Adios!");

        input.close();
    }
}