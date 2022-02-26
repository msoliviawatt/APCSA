import java.util.*;

public class Cookies
{
    public static void main(String[]arg)
    {
    System.out.println("You are bringing cookies to a class of 20 students. All of them want to receive the same number of cookies, and the remaining ones will be donated to the cafeteria...");

    Scanner input = new Scanner(System.in);
    int cookies, cookiesperstudent, donations;
    System.out.println("How many cookies are you bringing?");
    cookies = input.nextInt();
    cookiesperstudent = cookies / 20;
    donations = cookies % 20;

    System.out.println("Each student will receive " + cookiesperstudent + " cookies, and " + donations + " will be donated to the cafeteria.");
    input.close();
    }
}