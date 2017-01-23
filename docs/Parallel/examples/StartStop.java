
import java.lang.*;
import java.util.*;

public class StartStop extends TimerTask {

	static public boolean running;
	static public class Fun extends Thread {
		public void run()
	    {
	    	System.out.println("setting running to false");
	      running = false;
	    }
	}
	static public Fun f = new Fun();

	public static void main(String[] args) {
		
		TimerTask tasknew = new StartStop();
		Timer clock = new Timer(true);

		running = true;
		int n = 0;
		// give java a few milliseconds to optimize...
		clock.schedule(tasknew, 10);
		while(running){
			n = n + 200;
			// with the next line it will terminate!!
//			System.out.println("running ? " + running);
		}

		System.out.println("n " + n);

	}

	public void run(){
		f.start();
	}

}
