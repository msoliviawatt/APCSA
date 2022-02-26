public class StringyMethods
{
    public static boolean x(String s)
    {
        return s == null || s.length() == 0;
    }
    public static int countOccurrences(String s, String target)
    {
        if (x(s) || x(target))
        {
            return 0;
        }

        int index = 0;
        int counter = 0;
        while(true)
        {
            index = s.indexOf(target, index);
            if(index != -1)
            {
                counter++;
                index += target.length();
            }
            else
            {
                break;
            }
        }

        return counter;
    }

    public static String reverse(String s)
    {
        String x = "";
        for(int i = 0; i < s.length(); i++)
        {
            x = s.substring(i, (i + 1)) + x;
        }
        return x;

    }

    public static String codeString(String s)
    {
        if (s == null || s.isEmpty())
        {
            return s;
        }

        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length - 1; i += 2)
        {
            char y = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = y;
        }

        return new String(ch);
    }

    public static int countSubstringsStartingWith(String s, String target)
    {
            int counter = 0;
            int index = 0;
            while (index != -1)
            {
                index = s.indexOf(target, index);
                if(index != -1)
                {
                    counter += (s.length() - (index + (target.length() - 1)));
                    index += target.length();
                }
            }

            return counter;
    }

    public static void main(String[]arg)
    {
        System.out.println("Expected: 4");  
        System.out.println("  Actual: " + countOccurrences("Miss Mississippi is here!", "is"));  
        System.out.println("Expected: 0");  System.out.println("  Actual: " + countOccurrences("Miss Mississippi is here!", "sips"));     
        System.out.println("Expected: rebraB .rM");  
        System.out.println("  Actual: " + reverse("Mr. Barber"));  
        System.out.println("Expected: suoicodilaipxecitsilegarfilacrepus");  
        System.out.println("  Actual: " + reverse("supercalifragelisticexpialidocious"));
        System.out.println("Expected: abllte");  
        System.out.println("  Actual: " + codeString("ballet"));  
        System.out.println("Expected: dobdlal");  
        System.out.println("  Actual: " + codeString("oddball"));  
        System.out.println("Expected: beautiful");  
        System.out.println("  Actual: " + codeString(codeString("beautiful")));              
        System.out.println("Expected: 3");  
        System.out.println("  Actual: " + countSubstringsStartingWith("blue", "bl"));  
        System.out.println("Expected: 13");  
        System.out.println("  Actual: " + countSubstringsStartingWith("bubble", "b"));  
        System.out.println("Expected: 11"); 
        System.out.println("  Actual: " + countSubstringsStartingWith("Miss Mississippi", "si"));
        System.out.println("Expected: 19");   
        System.out.println("  Actual: " + countSubstringsStartingWith("bubbble", "b"));
        System.out.println("Expected: 12");   
        System.out.println("  Actual: " + countSubstringsStartingWith("robotics", "o"));    
    }
}