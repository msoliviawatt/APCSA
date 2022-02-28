package ManagingAnArrayList;
import java.util.*;
public class CarDriver {
    static Scanner input = new Scanner(System.in);
    public static void displayMenu() {
        System.out.println();
        System.out.println("MENU");
        System.out.println("----");
        System.out.println("Enter 1 to add a car");
        System.out.println("Enter 2 to remove a car");
        System.out.println("Enter 3 to sort cars by year");
        System.out.println("Enter 4 to display cars");
        System.out.println("Enter 5 to exit");
    }

    public static void addCar(ArrayList<Car> cars) {
        System.out.println();
        int y = -1;

        do {
            try  {
                System.out.print("Year manufactured:  ");
                y  = input.nextInt();
            } catch (InputMismatchException ime) {
                System.out.print("Invalid year! ");
            }
            input.nextLine();
        } while (y < 0); 

        System.out.print("Model: ");
        String m = input.nextLine();
        System.out.print("Color: ");
        String c = input.nextLine();

        Car car = new Car(y, m, c);
        cars.add(car);
    }

    public static void removeCar(ArrayList<Car> cars) {
        System.out.println();
        System.out.println("Enter the car model you would like to remove");
        String rem = input.nextLine().toLowerCase();
        int i = cars.size() - 1;
        int count = 0;
        while(i < cars.size() && i > -1) {
            String key = cars.get(i).getModel().toLowerCase();
            if(key.equals(rem)) {
                cars.remove(i);
                count++;
            }
            i--;
        }
        if(count == 0) {
            System.out.println("car not found :(");
        }

        else {
            System.out.println("ALL " + rem.toUpperCase() + " CARS REMOVED!");
        }
    }

    public static ArrayList<Car> sort(ArrayList<Car> cars) {
        for(int i = 0; i < cars.size(); i++) {
            Car key = cars.get(i);
            int j = i - 1;
            while(j >= 0 && (cars.get(j).compareTo(key) > 0)) {
                cars.set((j + 1), cars.get(j));
                j--;
            }
            cars.set((j + 1), key);
        }
        System.out.println("SORTED!");
        return cars;
    }

    public static void display(ArrayList<Car> cars) {
        System.out.println();
        System.out.println("CARS:");
        for(int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }

    public static void main(String[] arg) {
        ArrayList<Car> cars = new ArrayList<Car>();
        Scanner input = new Scanner(System.in);
        int num = 0;

        while(num != 5) {

            do {
                try { 
                    displayMenu();
                    num = input.nextInt();
                } catch (InputMismatchException no) {
                    System.out.println("Invalid number");
                }
                input.nextLine();
            } while(num < 1 || num > 5);

            if(num == 1) {
                addCar(cars);
                num = 0;
           } 

            else if(num == 2) {
                removeCar(cars);
                num = 0;
            }

            else if(num == 3) {
                sort(cars);
                num = 0;
            }

            else if(num == 4) {
                display(cars);
                num = 0;
            }

            else if(num == 5) {
                System.out.println("Bye!");
                break;
                }
        }
        input.close();
    }
}