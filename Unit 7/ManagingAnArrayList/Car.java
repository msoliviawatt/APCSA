package ManagingAnArrayList;
public class Car implements Comparable<Object>{

    private int year;
    private String model;
    private String color;

    public Car(int y, String m, String c) {
        year = y;
        model = m;
        color = c;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return year + " " + model + " (" + color + ")";
    }

    public int compareTo(Object other) {
        Car x = (Car)other;
        if (year < x.getYear())
         return -1;
        else if (year > x.getYear())
         return +1;
        else
         return model.compareTo(x.getModel());
    }
}