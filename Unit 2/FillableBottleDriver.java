public class FillableBottleDriver
{
    public static void main(String[]arg)
    {
        FillableBottle firstBottle = new FillableBottle();
        FillableBottle secondBottle = new FillableBottle("purple", 16);

        System.out.println(firstBottle.toString());
        System.out.println(secondBottle.toString());
        System.out.println();

        System.out.println("adding...");
        firstBottle.add(6);
        secondBottle.add(12);
        System.out.println(firstBottle.toString());
        System.out.println(secondBottle.toString());
        System.out.println();

        System.out.println("removing...");
        firstBottle.remove();
        secondBottle.remove();
        System.out.println(firstBottle.toString());
        System.out.println(secondBottle.toString());

    }
}