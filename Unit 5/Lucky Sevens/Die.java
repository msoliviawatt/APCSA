public class Die
{
    private int value;

    public Die()
    {
        roll();
    }

    public int getSide()
    {
        return value;
    }

    public void roll()
    {
        value = ((int)(Math.random() * 6) + 1);
    }
}