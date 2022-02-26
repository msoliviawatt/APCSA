package ScaleMutator;
//Rev. Dr. Douglas R Oberle - Washington, DC
public class scaleMutator
{          
//pre:  a and b are valid index #s of list, which is not null
//post: swaps list[a] with list[b]  - modifies the array that is sent
//i.e., given list:[1,2,3,4], a:1, b:3 -> changes list to [1,4,3,2]
   public static void swap(int[] list, int a, int b)
   {
      int x = list[a];
      list[a] = list[b];
      list[b] = x;
   }

//pre:  list is not null
//post: nums is sorted in ascending order - modifies the array that is sent
//i.e., given list:[4,2,7,5] -> changes list to [2,4,5,7] 
//needs to work with an array of any size             
   public static void selSort(int[] list)
   {
      int temp;
      for(int i = 0; i < list.length; i++) {
         for(int j = i + 1; j < list.length; j++) {
            if(list[i] > list[j]) {
               temp = list[i];
               list[i] = list[j];
               list[j] = temp;

            }
         }
      }
   }

//pre:   list is not null
//post:  returns a new array with the same elements of list, but scrambled (put in random order)
//needs to work with an array of any size
   public static int[] scramble(int[]list)
   {
      int[] retVal = new int[list.length];
      
      for(int i = 0; i < retVal.length; i++) {
         while(retVal[i] == 0) {
            int j = (int)(Math.random() * retVal.length);
            if(list[j] != -1) {
               retVal[i] = list[j];
               list[j] = -1;
            }
         }
      }
      return retVal;
   }

//pre:  list is not null
//post: returns a new array with elements in list, but in reverse order
//i.e., given list:[1,2,3,4] -> returns [4,3,2,1]
//needs to work with an array of any size
   public static int[] reverse(int[]list)
   {
      int j = list.length -1;
      for(int i = 0; i < j; i++, j--) {
        int x = list[i];
        list[i] = list[j];
        list[j] = x;
     }
   
      return list;
   }

//pre:  list is not null
//post: returns a new array (almost double the size of list) with the elements of list as a palindrome.
//i.e., given list:[1,2,3,4] -> returns [1,2,3,4,3,2,1]
//needs to work with an array of any size
   public static int[] makePalindrome(int[]list)
   {
      int[] palindrome = new int[list.length + (list.length - 1)];
      int[] reversedList = new int[list.length - 1];

      for(int i = 0; i < reversedList.length; i++) {
         reversedList[i] = list[i];
      }
      reverse(reversedList);
      for(int i = 0; i < list.length; i++) {
         palindrome[i] = list[i];
      }
      int temp = 0;
      for(int i = list.length; i < palindrome.length; i++) {
         palindrome[i] = reversedList[temp];
         temp++;
      }
     
      return palindrome;
   }   

//pre:  neither a nor b are null, assume a.length == b.length
//post: returns a new array with elements shuffles in from two lists,
//alternating between advancing elements of lists a and b
//[a0, b0, a1, b1, a2, b2, a3, b3, a4, b4,...]
//i.e., given a:[0,1,2,3], b:[9,8,7,6] -> returns [0,9,1,8,2,7,3,6]
//needs to work with arrays of any size
   public static int[] shuffle(int[]a, int[]b)
   {
      int len = a.length + b.length;
      int apple = 0;
      int banana = 0;
      int [] shuffledArray = new int[len];
      for(int i = 0; i < len; i += 2) {
         shuffledArray[i] = a[apple];
         apple++;
      }
      for(int i = 1; i < len; i += 2) {
         shuffledArray[i] = b[banana];
         banana++;
      }
      return shuffledArray;
   }

 //pre:  list is not null	
 //post: returns a new array with elements of list, but shuffled- 
 //alternating between elements from the beginning moving right and elements from the end moving left
 //[1st elem, Last elem, 2nd elem, 2nd to last elem, 3rd elem, 3rd to last elem, 4th elem, 4th to last elem,...]
 //i.e., given list:[0,1,2,3,4,5,6,7] -> returns [0,7,1,6,2,5,3,4]
 //needs to work with an array of any size
   public static int[] shuffle(int[]list)
   {
     int a = 0;
     int b = list.length - 1;
     int[] newArray = new int[list.length];

     for(int i = 0; i < list.length; i++) {
        if(i % 2 == 0) {
           newArray[i] = list[a];
           a++;
        }
        else {
           newArray[i] = list[b];
           b--;
        }
     }

      return newArray;
   }

//pre:  list is not null, note is between 22 and 108
//post:  makes a new array containing each element of list, but where every other element is note
//[list0, note, list1, note, list2, note, list3, note, list4, note,...]
//if list:[2, 4, 6, 8] and note:1 -> returns [1,2,1,4,1,6,1,8]
//needs to work with an array of any size
   public static int[] mixWithNote(int[] list, int note)
   {
      int n = note;
      int a = 0;
      int[] newArray = new int[list.length * 2];

      for(int i = 0; i < newArray.length; i++) {
         if(i % 2 == 0) {
            newArray[i] = n;
         }
         else {
            newArray[i] = list[a];
            a++;
         }
      }
     
      return newArray;
   }

//pre:  list is at least of length 3
//post:  makes a new array containing triads (groups of 3 consecutive notes in the scale), each starting with successive elements of list
//[1st elem, 2nd elem, 3rd elem, 2nd elem, 3rd elem, 4th elem, 3rd elem, 4th elem, 5th elem,...]
//if list:[1,2,3,4,5,6] -> returns [1,2,3,  2,3,4,  3,4,5, 4,5,6]
   public static int[] triads(int[] list)
   {
      int len = ((list.length - 3) * 3) + 3;
      int a = 0;
      int b = a + 1;
      int c = a + 2;
      int[] newArray = new int[len];

      for(int i = 0; i < len; i+= 3) {
         newArray[i] = list[a];
         newArray[i + 1] = list[b];
         newArray[i + 2] = list[c];
         a++;
         b = a + 1;
         c = a + 2;
      }
      return newArray; 	//temporary statement to keep us compiling
     //*****************************************
   }
   
   //post:  student invents their own mutation to the scale
   //plays each note three times
   public static int[] extraCredit(int[] list)
   {
      int i = 0;
      int x = 0;
      int[] newArray = new int[list.length * 3];

      while(i < newArray.length) {
         for(int j = 0; j < 3; j++) {
            newArray[i] = list[x];
            i++;
         }
         x++;
      }
     
      return newArray; 	//temporary statement to keep us compiling
   }

   public static void main(String[]arg) {

      
   }
} 	
