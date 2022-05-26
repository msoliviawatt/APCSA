import java.util.*;
public class SuperPrimes
{
   /* COMPLETE THIS METHOD */
   // main method, use comments as a guide
   public static void main(String[] args)
   {             
      Scanner input = new Scanner(System.in);
      // tell the user what the program will do
      System.out.println("This program will display all superprime numbers of the desired length");
      
      // prompt the user for the number of digits and read in response
      System.out.println("Enter a positive integer!");
      int num = input.nextInt();
      input.close();
      
      // determine lower and upper bounds for looping
      // over numbers with that many digits
      int lower = (int)(Math.pow(10, (num - 1)));
      int upper = (int)(Math.pow(10, (num)) -1);
      System.out.println("searching for superprime numbers from " + lower + " to " + upper + "...");
      
      
      // for each number, determine whether it is a superprime
      // and if so, output it to the screen.
      boolean prime = false;
      for(int i = lower; i < upper; i++) {
         if(superPrime(i)) {
            System.out.println(i);
            prime = true;
         }
      }
      
      // if there are no superprimes, output "None"
      if (prime == false) {
         System.out.println("None");
      }

   }
   
   /* COMPLETE THIS METHOD */
   // Recursive method.
   // return true if the provided number is superprime, false otherwise.
   public static boolean superPrime(int x)
   {
      if(isPrime(x) && x < 10) {
         return true;
      }
      else if(isPrime(x) && x > 10) {
         return superPrime(x / 10);
      }
      else if(!isPrime(x)) {
         return false;
      }
      else {
         return false;
      }
   }
   
   /* COMPLETE THIS METHOD */
   // non-recursive method.
   // return true if the provided number is prime, false otherwise
   public static boolean isPrime(int num)
   {
      if(num > 3) {
         for(int i = 2; i < num; i++) {
         if(num % i == 0) {
            return false;
            }
         }
      }
      return true;
   }
}