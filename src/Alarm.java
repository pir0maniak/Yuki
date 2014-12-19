import java.sql.Time;


public class Alarm extends Thread{

	
	public Alarm(String time) {
		// TODO Auto-generated constructor stub
		time = time.substring(time.length()-5, time.length());
		int hour1 = MyDate.curDate().getHours();
		int min1 = MyDate.curDate().getMinutes();
		int hour = Integer.parseInt(time.substring(0, 2));
		int min = Integer.parseInt(time.substring(3, 5));
		
		
		System.out.print(hour+" "+min);
	}
	
	
	
	@Override
	public void run(){
		
	}
}
