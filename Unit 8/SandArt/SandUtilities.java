package SandArt;
import java.awt.Color;

public class SandUtilities
{
  //pre : c!= null
  //post: returns the inverted color from the one sent as c
   public static Color invert(Color c)
   {
      return new Color(255 - c.getRed(), 255 - c.getGreen(), 255 - c.getBlue());      //temporary return statement to keep things compiling
   }
   
   //pre:   m!= null
   //post:  for each non-null element of m, changes it to its inverted color
   //       skips any color with the value skip1 and skip2, leaving them unchanged
   public static void invertColors(Color[][]m, Color skip1, Color skip2)
   {
      for(int i = 0; i < m.length; i ++) {
         for(int j = 0; j < m[0].length; j++) {
            if(m[i][j] != skip1 && m[i][j] != skip2) {
               m[i][j] = new Color(255 - m[i][j].getRed(), 255 - m[i][j].getGreen(), 255 - m[i][j].getBlue());
            }
         }
      }
   }
   
   //pre:   m is a square 2-D array (m.length==m[0].length)
   //post:  flips the array upside down
   public static void flipUpsideDown(Object[][]m)
   {
      for(int i = 0; i < (m.length / 2); i++) {
         Object[] temp = m[i];
         m[i] = m[m.length - i - 1];
         m[m.length - i - 1] = temp;
      }
   }
   
   //pre:   m is a square 2-D array (m.length==m[0].length)
   //post:  rotates the array 90 degrees to the left
   public static void rotateLeft(Object[][] m) 
   {
      for(int i = 0; i < m.length; i++) {
         for(int j = 0; j < i; j++) {
             Object temp = m[i][j];
             m[i][j] = m[j][i];
             m[j][i] = temp;
         }
     }

     for(int i = 0; i < m.length; i++) {
         for(int j = 0; j < m.length / 2; j++) {
             Object temp = m[i][j];
             m[i][j] = m[i][m.length - j - 1];
             m[i][m.length - j- 1] = temp;
         }
     }

     for(int i = 0; i < m.length; i++) {
         for(int j = 0; j < i; j++) {
             Object temp = m[i][j];
             m[i][j] = m[j][i];
             m[j][i] = temp;
         }
     }

     for(int i = 0; i < m.length; i++) {
         for(int j = 0; j < m.length / 2; j++) {
             Object temp = m[i][j];
             m[i][j] = m[i][m.length - j - 1];
             m[i][m.length - j- 1] = temp;
         }
     }

     for(int i = 0; i < m.length; i++) {
         for(int j = 0; j < i; j++) {
             Object temp = m[i][j];
             m[i][j] = m[j][i];
             m[j][i] = temp;
         }
     }

     for(int i = 0; i < m.length; i++) {
         for(int j = 0; j < m.length / 2; j++) {
             Object temp = m[i][j];
             m[i][j] = m[i][m.length - j - 1];
             m[i][m.length - j- 1] = temp;
         }
     }
   }

   //pre:   m is a square 2-D array (m.length==m[0].length)
   //post:  rotates the array 90 degrees to the right
   public static void rotateRight(Object[][] m)
   {
      for(int i = 0; i < m.length; i++) {
         for(int j = 0; j < i; j++) {
             Object temp = m[i][j];
             m[i][j] = m[j][i];
             m[j][i] = temp;
         }
     }

     for(int i = 0; i < m.length; i++) {
         for(int j = 0; j < m.length / 2; j++) {
             Object temp = m[i][j];
             m[i][j] = m[i][m.length - j - 1];
             m[i][m.length - j- 1] = temp;
         }
     }
   }      
}