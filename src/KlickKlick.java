import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class KlickKlick {

	Robot robot;
	
	public KlickKlick() throws AWTException, InterruptedException{
		robot = new Robot();
		robot.mouseMove(789, 998);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(300);
        robot.mouseMove(500, 900);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(300);
        textKliker("Привет");
	}
	private void textKliker(String text){
		
		char a = text.charAt(0); 
		System.out.print("");
	}
}
