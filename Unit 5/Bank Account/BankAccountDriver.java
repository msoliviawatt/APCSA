public class BankAccountDriver
{
    public static void main(String[]arg)
    {
        BankAccount aloha = new BankAccount("Olivia", 420.69);
        System.out.println(aloha);
        aloha.deposit(246);
        System.out.println("\n" + "depositing funds..." + "\n");
        System.out.println(aloha);
        System.out.println("\n" + "withdrawing funds... " + "\n");
        aloha.withdraw(597);
    }
}