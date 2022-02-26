public class BPDriver 
{
    public static void main(String[]arg)
    {
        Book a = new Book("Hello", "Your Mom");
        Book b = new Book("Goodbye", "Your Dad");
        Book c = new Book("Joe", "Mama");

        Patron Olivia = new Patron("Olivia");
        Patron Bob = new Patron("Bob");
        Patron Hehe = new Patron("Hehe");

        Olivia.borrow(a);
        Olivia.borrow(b);
        Olivia.borrow(c);
        System.out.println(Olivia);
        Olivia.giveBack(a);
        Olivia.giveBack(b);
        Olivia.giveBack(c);
        System.out.println(Olivia);

        System.out.println();

        Bob.borrow(a);
        Bob.borrow(b);
        Bob.borrow(c);
        System.out.println(Bob);
        Bob.giveBack(b);
        System.out.println(Bob);

        Hehe.borrow(b);
        Hehe.borrow(a);
        System.out.println(Hehe);
        Hehe.giveBack(a);
        System.out.println(Hehe);
    }
}
