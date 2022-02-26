public class RandoString
{
   public static void main(String[] args)
   {
      String hello = "hello";
      String bye = "goodbye";
      
      // Goal 1: Create a new String named combo by inserting
      // the contents of the hello string at a randomly
      // selected position in the bye String. For example,
      // one potential result would be goohellodbye and another
      // might be goodbhelloye. You will write and call the
      // combine method to accomplish this.
      
      // TO DO 1. call the combine method
      String modified = combine(hello, bye);
      
      
      // TO DO 2. print out the new String
      System.out.println(modified);
      
      
      // TO DO 3. print out the new String in ALL CAPS
      System.out.println(modified.toUpperCase());
      
      
      // TO DO 4. print out the location of ll in the new string
      int x = modified.indexOf("ll");
      System.out.println("ll is at location: " + x);

      
   }
   
   // TO DO 5. combine method
   // Write the combine method here (be sure to make it static)
   // It should accept two Strings as input and produce a String for output
   // The new String should NOT be printed in this method.
   // The method will generate a random number.
   // The number generated should be a valid index in the second input String
   // The produced String should be the result of inserting the first input
   // string into the second input string at a randomly selected location.
   // start by writing the method Header here

   public static String combine(String str, String str2)
   {
      // generate an appropriate random number here. What should the bounds be?
      int rand = (int)(Math.random() * str2.length());
      
      // print out the random number in the proper format
      // (random is: n)
      System.out.println("random is: " + rand);
      
    
      // build the new String here
      String beginning = str2.substring(0, rand);
      String end = str2.substring(rand);
      String newString = (beginning + str + end);
      
      // send the new String back to the caller (do not print here!)
      return newString;
      
   }

}