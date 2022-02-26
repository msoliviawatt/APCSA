public class Randomness
{
   public static void main(String[] args)
   {
      // This is the original string
      String randomString = "Will it work?";
      // TO DO 1. print out the original string
      System.out.println(randomString);
   
      // TO DO 2. call the randomStar method
      String modified = randomStar(randomString);
      
      // TO DO 3. print out the modified string
      System.out.println(modified);
      
      // TO DO 4. print out the location of the "*" in the modified string
      int x = modified.indexOf("*");
      System.out.println("star is at location " + x);
   }
   
   // TO DO 5. randomStar method
   // Write the randomStar method here (be sure to make it static)
   // It should accept a String as input and produce a String for output
   // The new String should NOT be printed in this method.
   // The method will generate a random number.
   // The number generated should be a valid index in the input String
   // The produced String should match the input with one exception:
   // The character at the random index should be a *.
   // start by writing the method Header here
   public static String randomStar(String str)
   {
      // generate an appropriate random number here. What should the bounds be?
      int rand = (int)(Math.random()*str.length());
      
      // print out the random number in the proper format
      // (random is: n)
      System.out.println("random is: " + rand);
            
      // print out a line indicating what is changing in the proper format
      // (changing "a" to "*")
      String origChar = str.substring(rand, rand+1);
      System.out.println("changing \"" + origChar + "\" to \"*\"");
    
      // build the new String here
      String beg = str.substring(0, rand);
      String end = str.substring(rand+1);
      String newString = beg + "*" + end;
      
      // send the new String back to the caller
      return newString;
   }
}