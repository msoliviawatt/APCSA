public class BankAccount
{
    private String name;
    private double balance;

    public BankAccount(String n, double b)
    {
        name = n;
        balance = b;
    }

    public String getName()
    {
        return name;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double funds)
    {
        balance += funds;
    }
    public void withdraw(double funds)
    {
        balance -= funds;
    }
    public String toString()
    {
        return "Account owner's name: " + name + "\n" + "Account balance: " + balance;
    }
}