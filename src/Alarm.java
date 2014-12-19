import java.awt.Toolkit;
import java.sql.Time;
import java.util.Timer;


public class Alarm {

	int totalTime;
	Timer timer;
	
	public Alarm(String time) {
		// TODO Auto-generated constructor stub
		time = time.substring(time.length()-5, time.length());
		int hour1 = MyDate.getCurHour();
		int min1 = MyDate.getCurMin();
		int sec = 60 - MyDate.getCurSec();
		System.out.println(" "+hour1+"h");
		System.out.println(" "+min1+"m");
		System.out.println(" "+sec+"s");
		int hour = Integer.parseInt(time.substring(0, 2));
		int min = Integer.parseInt(time.substring(3, 5));
		int totalHour;
		if ((hour-hour1)<0){
			totalHour = (24 - hour1)+hour;
		}
		else
		{
			totalHour = hour-hour1;
		}
		if ((min-min1)<0){
			totalTime = (60-min1)+min;
			totalHour = totalHour - 1;
		}
		else
		{
			if ((min-min1)>1){
			totalTime = min-min1;
			}
		}	
		totalTime += (totalHour*60);
		totalTime = (totalTime*60)+sec;
		
		System.out.print(hour+" "+min);
	}
	
	
	

	public void go(){
		
	    timer = new Timer();
	    System.out.println(" "+totalTime+"on");
	    timer.schedule(new RemindTask(), totalTime * 1000);
	}
}


