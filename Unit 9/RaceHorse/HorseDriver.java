package RaceHorse;
import java.util.*;

public class HorseDriver 
{
    public static void printHorses(Horse[] horses) {
        for(Horse x: horses) {
            System.out.println(x);
        }
        System.out.println();
    }

    public static boolean checkWin(Horse[] horses) {
        for(int i = 0; i < horses.length; i++) {
            if(horses[i].getLocation() >= 15) {
                return true;
            }
        }
        return false;
    }

    public static void move(Horse[] horses) {
        for(int i = 0; i < horses.length; i++) {
            horses[i].raceStride();
        }
        printHorses(horses);
    }

    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            try  {
                System.out.println("How many horses do you want?");
                num = input.nextInt();
            } 
            catch (InputMismatchException InvalidInput) {
                System.out.print("Invalid input");
            }
        } while (num < 0);
        input.close();

        Horse[] horses = new Horse[num];

        for(int i = 0; i < horses.length; i++) {
            int rand = (int)(Math.random()*100);
            if(rand > 50) {
                horses[i] = new Horse(1, i);
            }
            else  {
                horses[i] = new Filly(1, i);
            }
        }

        printHorses(horses);

        int z = 0;
        while(z == 0) {
            move(horses);
            if(checkWin(horses)) {
                break;
            }
        }

        for(int i = 0; i < horses.length; i++) {
            if(horses[i].getLocation() == 15) {
                System.out.println("Horse " + i + " won!");
            }
        }
    }
}