import java.lang.management.ThreadInfo;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;



public class MyDate{
	
	private static String timeZone;
	
	public void MyDate(){
		
	}
	public static Calendar curDate(){
		timeZone = "GMT+3:00";
		TimeZone.setDefault(TimeZone.getTimeZone(timeZone));
		Calendar curDate = GregorianCalendar.getInstance();
		return curDate;
	}
	public static String formatTime(Calendar date){
		String stringTime = new SimpleDateFormat("HH:mm").format(date.getTime());
		return stringTime;
	}
	
	public static void setTimeZone(int i){
		String s="+";
		if(i<0){
			s="-";
		}
		timeZone = String.format("GMT%s%d:00", s,i);
	}
	
	public static int getCurHour(){
		String stringTime = new SimpleDateFormat("HH").format(MyDate.curDate().getTime());
		int hour = Integer.parseInt(stringTime);
		return hour;
	}
	
	public static int getCurMin(){
		String stringTime = new SimpleDateFormat("mm").format(MyDate.curDate().getTime());
		int min = Integer.parseInt(stringTime);
		return min;
	}
	
	public static int getCurSec(){
		String stringTime = new SimpleDateFormat("ss").format(MyDate.curDate().getTime());
		int min = Integer.parseInt(stringTime);
		return min;
	}
}
