
import java.lang.*;

public class DecThread extends Thread
{
    private static final int MAX = 1000;
    private Counter myCounter;

    public DecThread(Counter c)
    {
        myCounter = c;
    }

    public void run()
    {
        for (int i = 0; i < MAX; i++)
        {
            myCounter.decrement();
        }
    }
}