import java.util.*;
public class RightTriangle
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        int x, y, z, hypotenuse, sideOne, sideTwo;
        System.out.println("Enter the length of the first side of the triangle");
        x = input.nextInt();
        System.out.println("Enter the length of the second side!");
        y = input.nextInt();
        System.out.println("Enter the length of the third side!");
        z = input.nextInt();

        if(x > y && x > z)
        {
            sideOne = y;
            sideTwo = z;
            hypotenuse = x;
        }
        else if(!(x > y && x > z) && (y > x && y > z))
        {
            sideOne = x;
            sideTwo = z;
            hypotenuse = y;
        }
        else
        {
            sideOne = x;
            sideTwo = y;
            hypotenuse = z;
        }

        if(Math.pow(sideOne,2) + Math.pow(sideTwo, 2) == Math.pow(hypotenuse,2))
        {
            System.out.println("The triangle is a right triangle!");
        }
        else
        {
            System.out.println("The triangle is not a right triangle!");
        }

        input.close();
    }
}