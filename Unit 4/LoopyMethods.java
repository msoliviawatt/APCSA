public class LoopyMethods 
{

    public static void main(String[] args)  
    {
        System.out.print("Expected: ");      
        System.out.println("* * * * * * * *");      
        System.out.print("  Actual: ");      
        printStars(8);      
        System.out.println();            
        System.out.print("Expected: ");      
        System.out.println("8 16 24 32 40 48 56 64 72 80 88 96");      
        System.out.print("  Actual: ");      
        printMults(8, 100);      
        System.out.println();            
        System.out.println("Expected: 4");      
        System.out.println("  Actual: " + countEs("Elmer is an elephant."));      
        System.out.println("Expected: 3");      
        System.out.println("  Actual: " + countEs("Isn't Elastigirl incredible?"));    
    }
    
    public static void printStars(int n)
    {
        int x = 0;
        while(x < n)
        {
            System.out.print("* ");
            x++;
        } 
    }

    public static void printMults(int num, int limit)
    {
        int y = 2;
        int ans = num;
        while(ans < limit)
        {
            System.out.print(ans + " ");
            ans = y * num;
            y++;
        }
    }

    public static int countEs(String sentence)
    {
        int counter = 0;
        char lowerE = 'e';
        char upperE = 'E';
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) == lowerE || (sentence.charAt(i) == upperE))
            {
                counter++;
            }
        }
        return counter;
    }
}
    
