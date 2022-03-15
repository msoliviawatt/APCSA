package RaceHorse;

public class Filly extends Horse {
    private int power;

    public Filly(int loc, int i)
    {
        super(loc, i);
        power = ((int)(Math.random()*61) + 30);
    }

    public void raceStride() {
        int rand = (int)(Math.random()*100);
        if(rand < power) {
            advance();
        }
    }

    public String toString() {
        return super.toString() + "*";
    }
}
