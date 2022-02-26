import java.util.*;
public class MagicSquare {

    public static boolean magicSquare(int[][] array) {
        int columnSum = 0;
        for(int i = 0; i < array.length; i++) {
            columnSum += array[i][0];
        }

        int rowSum = 0;
        for(int c = 0; c < array.length; c++) {
            rowSum += array[0][c];
        }

        int diagonalSum = 0;
        for(int i = 0; i < array.length; i++) {
            diagonalSum += array[i][i];
        }

        int diagonalSum2 = 0;
        int row = array.length - 12;
        int column = 0;
        for(int i = 0; i < array.length; i ++) {
            diagonalSum2 += array[row][column];
            row -= 1;
            column += 1;
        }

        if(columnSum == rowSum && columnSum == diagonalSum && columnSum == diagonalSum2) {
            return true;
        }
        else {
            return false;
        }
    }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] hello = new int[4][4];
        for(int r = 0; r < hello.length; r++) {
            for(int c = 0; c < hello[0].length; c ++) {
                System.out.println("Enter a number to fill the square!");
                int number = input.nextInt();
                hello[r][c] = number;
            }
        }

        System.out.println("Here is your 2D array:");
        for(int r = 0; r < hello.length; r++) {
            for(int c = 0; c < hello[0].length; c ++) {
                System.out.print(hello[r][c] + " ");
            }
            System.out.println(" ");
        }

        if(magicSquare(hello)) {
            System.out.println("You have created a magic square!");
        }
        else {
            System.out.println("Your 2D array is not a magic square");
        }

        input.close();
    }
}