import java.util.Arrays;
public class Something {
    public static void main(String[]arg) {
        int[] x = {1, 2, 3, 4, 5};
        int[] correct = {1, 2, 3, 4, 5};

        if(Arrays.equals(x, correct)) {
            System.out.println("yay");
        }
        else {
            System.out.println("not yay");
        }
    }
}
