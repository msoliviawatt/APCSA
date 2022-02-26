package StatesLab;
public class State {
    private String name, abbreviation, capital;

    public State(String n, String a, String c) {
        name = n;
        abbreviation = a;
        capital = c;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCapital() {
        return capital;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Abbreviaton: " + abbreviation + "\n" + "Capital:  " + capital;
    }
}
