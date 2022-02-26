package Fraction;

public class FractionDriver
{
    public static void main(String[]arg)
    {
        Fraction x = new Fraction(1, 2);
        Fraction y = new Fraction(3, 4);
        Fraction z;

        z = x.add(y);
        System.out.println(x + " + " + y + " = " + z);

        z = x.subtract(y);
        System.out.println(x + " - " + y + " = " + z);

        z = x.multiply(y);
        System.out.println(x + " * " + y + " = " + z);

        z = x.divide(y);
        System.out.println(x + " * " + y + " = " + z);
    }
    
}