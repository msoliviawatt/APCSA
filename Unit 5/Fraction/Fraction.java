package Fraction;

public class Fraction 
{
    private int numerator;
    private int denominator;

    public Fraction(int n, int d)
    {
        numerator = n;
        denominator = d;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public Fraction add(Fraction x)
    {
        int n = numerator * x.getDenominator() + x.getNumerator() * denominator;
        int d = denominator * x.getDenominator();
        return new Fraction(n, d);
    }

    public Fraction subtract(Fraction x)
    {
        int n = numerator * x.getDenominator() - x.getNumerator() * denominator;
        int d = denominator * x.getDenominator();
        return new Fraction(n, d);
    }

    public Fraction multiply(Fraction x)
    {
        int n = numerator * x.getNumerator();
        int d = denominator * x.getDenominator();
        return new Fraction(n, d);
    }

    public Fraction divide(Fraction x)
    {
        int n = numerator * x.getDenominator();
        int d = denominator * x.getNumerator();
        return new Fraction(n, d);
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }
}
