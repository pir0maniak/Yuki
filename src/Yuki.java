import java.awt.AWTException;
import java.util.Scanner;


public class Yuki {

	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Emotions em = new Emotions();
		em.getEmotion(em.bodrost);
		em.getEmotion(em.napryag);
		Scanner reader = new Scanner(System.in);
		String comand="";
		while(!comand.equals("пока"))
		comand = reader.nextLine().toLowerCase();
		}
	

}
