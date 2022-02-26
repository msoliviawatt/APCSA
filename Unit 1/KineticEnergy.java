import java.util.*;
public class KineticEnergy
{
    public static void main(String[]arg)
    {
        int again = 1;
        while(again == 1)
        {
        Scanner input = new Scanner(System.in);
        double mass, velocity, kineticenergy, momentum;
        System.out.println("Welcome to the kinetic energy and momentum finder!");
        System.out.println("Please enter the mass value (in kilograms).");
        mass = input.nextDouble();
        System.out.println("Please enter the velocity (in meters per second)");
        velocity = input.nextDouble();
        kineticenergy = 1.0/2.0 * mass * velocity * velocity;
        momentum = mass * velocity;
        System.out.println("Ok, kid. The kinetic energy of your object is: " + kineticenergy + " joules");
        System.out.println("The momentum of your object is: " + momentum + " kilogram meters per second");
        System.out.println("Enter 1 to run this program again or 0 to make it go byebye!");
        again = input.nextInt();
        input.close();
        }
    }
}
