import java.util.*;
public class Permutations 
{

    public static void reverseArray(int [] array, int n)
    {
        int [] reveresedArray = new int[n];
        int x = n;
        for(int i = 0; i < n; i++)
        {
            reveresedArray[x - 1] = array[i];
            x = x - 1;
        }
        System.out.println("Here is your array with the first " + n + " numbers reversed");
        int [] result = new int[array.length];

        for(int j = 0; j < n; j++)
        {
            result[j] = reveresedArray[j];
        }
        for(int j = reveresedArray.length; j < array.length; j++)
        {
            result[j] += array[j];
        }
        for(int j = 0; j < result.length; j++)
        {
            array[j] = result[j];
            System.out.print(array[j] + " ");
        }

        System.out.println();
    }

    public static boolean isSorted(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            if(array[i] > array[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        int y = 1;
        while(y == 1)
        {
            int x;
            System.out.println("How many elements (5-20) would you like to shuffle?");
            x = input.nextInt();

            while(x < 5 || x > 20)
            {
                System.out.println("How many elements (5-20) would you like to shuffle?");
                x = input.nextInt();
            }

            int [] shuffledArray = new int[x];
            int number = 1;
            for(int i = 0; i < shuffledArray.length; i++)
            {
                shuffledArray[i] = number;
                number++;
            }

            int [] newArray = new int[x];
            for(int i = 0; i < newArray.length; i++)
            {
                while(newArray[i] == 0)
                {
                    int j = (int)(Math.random() * x);
                    if(shuffledArray[j] != -1)
                    {
                        newArray[i] = shuffledArray[j];
                        shuffledArray[j] = -1;
                    }
                }  
            }

            System.out.println("Here is your shuffled array: ");
            for(int i = 0; i < newArray.length; i++)
            {
                System.out.print(newArray[i] + " ");
            }
            System.out.println();

            int turns = 2 * x - 3;

            while(turns > 0  &&  isSorted(newArray) == false)
            {
                System.out.println("You have " + turns + " turn(s) remaining");
                System.out.println("Enter number of elements (2 - " + x + ") to reverse");
                int reverse = input.nextInt();
                while(reverse < 2 || reverse > x)
                {
                    System.out.println("Enter number of elements (2 - " + x + ") to reverse");
                    reverse = input.nextInt();
                }
                System.out.println();
                reverseArray(newArray, reverse);
                System.out.println();
                turns --;
                if(isSorted(newArray) == true)
                {
                    System.out.println("Congratulations! You win!");
                }
            }

            if(turns == 0 && isSorted(newArray) == false)
            {
                System.out.println("Out of turns - Game Over!");
            }

            System.out.println("Would you like to play again? \n Enter 1 for yes \n Enter 2 for no");
            y = input.nextInt();
        }
        input.close();
    }
}
