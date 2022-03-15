package RaceHorse;

public class Horse
{
    private int location, index;

    public Horse()
    {
        location = 1;
        index = 0;
    }

    public Horse(int loc, int i)
    {
        location = loc;
        index = i;
    }

    public int getLocation()
    {
        return location;
    }

    public int getIndex()
    {
        return index;
    }

    public void advance()
    {
        if(location < 15)
        {
            location += 1;
        }
    }

    public void raceStride()
    {
        int x = (int)(Math.random()*100);
        if(x < 50 && location < 15)
        {
            advance();
        }
    }

    public String toString()
    {
        String x = "|---------------|";
        return x.substring(0, location) + index + x.substring(location + 1);
    }
}