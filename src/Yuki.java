import java.awt.AWTException;
import java.util.Scanner;


public class Yuki {

	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Emotions emo = new Emotions();
		emo.getEmotion(emo.bodrost);
		emo.getEmotion(emo.napryag);
		Scanner reader = new Scanner(System.in);
		String comand="";
		while(!comand.equals("пока")){
		comand = reader.nextLine().toLowerCase();
		if (comand.equals("mon")){
			EmotionMonitor mon = new EmotionMonitor(emo);
		}
		}
		}
	

}
