import java.util.*;

public class Sphere
{
    public static void main(String[]arg)
    {
            Scanner input = new Scanner(System.in);
            int again = 1;
            while(again == 1)
        {
            double radius, diameter, circumference, surfacearea, volume;
            System.out.println("Enter the value of a sphere's radius!");
            radius = input.nextDouble();
            diameter = 2 * radius;
            circumference = 2 * Math.PI * radius;
            surfacearea = 4 * Math.PI * (radius * radius);
            volume = 4.0/3.0 * Math.PI * (radius * radius * radius);
            System.out.println("You said the sphere's radius was " + radius + "!");
            System.out.println("The diameter is: " + diameter);
            System.out.println("The circumference is " + circumference);
            System.out.println("The surfacearea is " + surfacearea);
            System.out.println("The volume is " + volume);
            System.out.println("Enter 1 to run this program again or 0 to quit :D");
            again = input.nextInt();
            input.close();
        }
      
    }
}