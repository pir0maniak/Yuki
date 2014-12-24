package tasks;

import yukimodel.Message;

public class Task {

	private boolean TaskAvailable=false;
	
	public static boolean isRespondToMessage(Message m){
		return false;
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
}
