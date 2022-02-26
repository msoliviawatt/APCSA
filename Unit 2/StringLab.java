public class StringLab
{
   // This lab provides practice using String methods
   public static void main(String[] args)
   {
      String myString = "The world is not flat.";
      String roundString = "round.";
      
      System.out.println(myString);
      
      // Use a String method to print out how long the string is
      System.out.println("The number of characters is: " + myString.length());
      
      // Use the one argument substring method to create a new string
      // that contains everything from myString from the "n" in not to the end
      String newString = "";
      newString = myString.substring(13);
      
      System.out.println(newString);
      
      // use the two argument substring method to extract the word "world"
      // from myString into a new String variable named world
      // print out the countents of the variable
      String world = "";
      world = myString.substring(4, 9);
      
      System.out.println(world);
      
      // print out the contents the world variable in all UPPERCASE
      world = world.toUpperCase();
      System.out.println(world);
      
      
      // use the appropriate String method to find and print
      // the index of the word "flat" from myString
      System.out.println("flat is at index " + myString.indexOf("flat"));

      
      // Using myString and roundString, use substring and concatenation
      // to create a new String variable named roundWorld that contains
      // "The world is round."
      String roundWorld = "";
      String x = myString.substring(0, 12);
      String y = roundString.substring(0);
      roundWorld = x + " " + y;
      
      System.out.println(roundWorld);
      
      // use the appropriate String method to find and print
      // the index of the word "flat" from roundWorld
      System.out.println("flat is at index " + roundWorld.indexOf("flat"));
      
   }
}