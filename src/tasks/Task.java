package tasks;

import java.util.Calendar;

import myDate.MyDate;

public class Task implements inter{

	private boolean TaskAvailable=false;
	
	private Calendar creationTime;
	
	public Task(){
		creationTime = MyDate.curDate();
	}
	
	public void onTask(){
		TaskAvailable=true;
	}
	
	public void offTask(){
		TaskAvailable=false;
	}
	
	public boolean isTaskAvailable(){
		return TaskAvailable;
	}
	
	public Calendar getCreationTime(){
		return creationTime;
	}
	
	public static boolean isRespond() {
		  System.out.println("false");
		  return false;
		 }

}
