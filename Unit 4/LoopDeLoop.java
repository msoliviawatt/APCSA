public class LoopDeLoop 
{
    public static void printStars(int n)
    {
        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStarsInSpace(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStarsVictory(int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            for(int j = i; j < n - 1; j++)
            {
                System.out.print(" ");
            }
            for(int j = i; j < n -1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
            
    }

    public static void main(String[]arg)
    {
        printStars(5);
        printStarsInSpace(5);
        printStarsVictory(5);
        printStars(8);
        printStarsInSpace(8);
        printStarsVictory(8);
        printStars(12);
        printStarsInSpace(12);
        printStarsVictory(12);
    }
}
