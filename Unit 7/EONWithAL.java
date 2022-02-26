import java.util.*;
public class EONWithAL {
    public static void main(String[] arg) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();
        ArrayList<Integer> negatives = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            System.out.println("Enter a number!");
            int x = input.nextInt();

            if(x < 0) {
                negatives.add(x);
            }
            if(x % 2 == 0) {
                evens.add(x);
            }
            if (x % 2 != 0) {
                odds.add(x);
            }
        }

        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);
        System.out.println("negatives: " + negatives);
        input.close();
    }
}
