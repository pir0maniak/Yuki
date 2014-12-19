import java.text.SimpleDateFormat;
import java.util.Date;


public class MyDate{
	
	public void MyDate(){
		
	}
	public static Date curDate(){
		long a = System.currentTimeMillis();
		Date curDate = new Date(a);
		
		return curDate;
	}
	public static String formatTime(Date date){
		String stringTime = new SimpleDateFormat("HH:mm").format(date);
		return stringTime;
	}
}
