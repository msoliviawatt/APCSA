package PersonLab;
import java.util.*;
public class PersonDriver {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            try  {
                System.out.print("Enter the number of people (3-10) in your list: ");
                num = input.nextInt();
            } 
            catch (InputMismatchException ime) {
                System.out.print("Invalid input");
            }
            input.nextLine();
        } while (num < 3 || num > 10);
        Person[] people = new Person[num];

        for(int i = 1; i <= num; i++) {
            System.out.println("Person " + i);
            int age =  -1;
            do {
                try  {
                    System.out.print("Enter age:  ");
                    age  = input.nextInt();
                } 
                catch (InputMismatchException ime) {
                    System.out.print("Invalid age! ");
                }
                input.nextLine();
            } while (age < 0); 
            System.out.print("Enter name: ");
            String name = input.nextLine();
            System.out.print("Enter eye color: ");
            String eye = input.nextLine();
            people[i - 1] = new Person(age, name, eye);
        }
        input.close();

        System.out.println();
        System.out.println("Original list:");
        printList(people);

        System.out.println();
        System.out.println("Insertion sort...");
        System.out.println("Here is the sorted list");
        insertionSort(people);
        printList(people);
    }

    public static Person[] insertionSort(Person[] info) {
        for(int i = 1; i < info.length; i++) {
            Person key = info[i];
            int j = i - 1;
            while(j >= 0 && info[j].compareTo(key) > 0) {
                info[j + 1] = info[j];
                j--;
            }
            
            info[j + 1] = key;
        }
        return info;
    }

    public static void printList(Person[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}