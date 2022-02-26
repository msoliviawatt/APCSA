package StatesLab;
import java.util.*;
import java.io.*;
public class StateFinder {

    public static void main(String argv[]) throws IOException {
        State[] states = new State[51];
        fill(states);

        Scanner input = new Scanner(System.in);
        int s = 0;
        while(s != -1) {
            System.out.println("Enter 1 to search by state name");
            System.out.println("Enter 2 to search by abbrevitaion");
            System.out.println("Enter 3 to search by capital");
            System.out.println("Enter -1 to quit");
            s = Integer.parseInt(input.nextLine());
            while(s != 1 && s != 2 && s != 3 && s!= -1) {
                System.out.println("Enter 1 to search by state name");
                System.out.println("Enter 2 to search by abbrevitaion");
                System.out.println("Enter 3 to search by capital");
                System.out.println("Enter 'exit' to quit");
                s = Integer.parseInt(input.nextLine());
            }
            if(s == -1) {
                break;
            }
            else if(s == 1) {
                String name = "";
                while(name.equals("")) {
                    System.out.println("Enter a state name");
                    name = input.nextLine();
                }
                name = name.toUpperCase();
                System.out.println();
                System.out.println(binNameSearch(states, name));
                System.out.println();
            }
            else if(s == 2) {
                String abb = "";
                while(abb.equals("")) {
                    System.out.println("Enter state abbrevitaion");
                    abb = input.nextLine();
                }
                abb = abb.toUpperCase();
                System.out.println();
                System.out.println(linearSearch(states, abb, s));
                System.out.println();
            }
            else if(s == 3) {
                String capital =  "";
                while(capital == "") {
                    System.out.println("Enter state capital");
                    capital = input.nextLine();
                }
                capital = capital.toUpperCase();
                System.out.println();
                System.out.println(linearSearch(states, capital, s));
                System.out.println();
            }
        }
        input.close();
    }

    public static int getFileSize(String name) throws IOException {
        Scanner input = new Scanner(new FileReader(name));
        int size = 0;
        while (input.hasNextLine()) {
            size++;
            input.nextLine();
        }
        input.close();
        return size;
    }

    public static State[] fill(State[] array) throws IOException {
        Scanner input = new Scanner(new FileReader("states.txt"));
        int i = 0;
        while(input.hasNextLine()) {
            String a, n, c;
            a = input.nextLine();
            n = input.nextLine();
            c = input.nextLine();
            array[i] = new State(n, a, c);
            i++;
        }
        input.close();

        return array;
    }

    public static void readFile(State[] array) throws IOException {
        for(int j = 0; j < array.length; j++)
            System.out.println(array[j]);
    }

    public static String binNameSearch(State[] array, String name) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = (right + left)/ 2;
            int key = array[mid].getName().compareToIgnoreCase(name);
            if(key == 0) {
                return array[mid].toString();
            }
            if(key > 0) {
                right = mid - 1;
            }
            if(key < 0) {
                left = mid + 1;
            }
        }
        return "State not found :(";
    }

    public static String linearSearch(State[] array, String key, int num) {
        for(int i = 0; i < array.length; i++) {
            if(num == 2) {
                String abb = array[i].getAbbreviation();
                if(key.equalsIgnoreCase(abb)) {
                    return array[i].toString();
                }
            }
            else if(num == 3) {
                String cap = array[i].getCapital();
                if(key.equalsIgnoreCase(cap)) {
                    return array[i].toString();
                }
            }
        }
        return "State not found :(";
    }

}