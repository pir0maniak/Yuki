import java.awt.Toolkit;
import java.util.Timer;

public class ReminderBeep {
	  Toolkit toolkit;

	  Timer timer;

	  public ReminderBeep(int seconds) {
	    toolkit = Toolkit.getDefaultToolkit();
	    timer = new Timer();
	    timer.schedule(new RemindTask(), seconds * 1000);
	  }
}