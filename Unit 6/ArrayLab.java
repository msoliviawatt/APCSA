public class ArrayLab
{

   private static double getAverage(double[] nums)
   {
      double sum = 0;
      for(int i = 0; i < nums.length; i++)
      {
          sum = sum + nums[i];
      }
      double average = sum / (nums.length);
      return average;
   }
   
   private static void showLargerValues(double[] nums, double avg)
   {
       System.out.println();
       System.out.print("Values greater than average: ");
       for(int i = 0; i < nums.length; i++)
       {
           if(nums[i] > avg)
           {
               System.out.print(nums[i] + " ");
           }
       }
       System.out.println();
    
   }
   
   public static void main(String[] args)
   {
      double[] nums = new double[10];
      nums[0] = 54.4;
      nums[1] = 67.0;
      nums[2] = 98.4;
      nums[3] = 84.3;
      nums[4] = 87.0;
      nums[5] = 45.0;
      nums[6] = 79.0;
      nums[7] = 56.0;
      nums[8] = 76.4;
      nums[9] = 87.7;
    
      double average = getAverage(nums);
      System.out.print("Average: " + average);
      showLargerValues(nums, average);
   }
}