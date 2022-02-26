public class HorseDriver 
{
    public static void main(String[]arg)
    {
        Horse zero = new Horse();
        Horse one = new Horse(1, 1);
        Horse two = new Horse(1, 2);

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println();

        while(zero.getLocation() < 15 && one.getLocation() < 15 && two.getLocation() < 15)
        {
            zero.raceStride();
            one.raceStride();
            two.raceStride();
            System.out.println(zero);
            System.out.println(one);
            System.out.println(two);
            System.out.println();
        } 

        if(zero.getLocation() == 15)
        {
            System.out.println("Horse 0 won!");
        }
        if(one.getLocation() == 15)
        {
            System.out.println("Horse 1 won!");
        }
        if(two.getLocation() == 15)
        {
            System.out.println("Horse 2 won!");
        }
    }
}