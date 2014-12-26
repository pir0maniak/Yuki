package yukimodel;
import java.util.Calendar;
import java.util.Observable;

import myDate.MyDate;


public class Message{

	private Calendar sendDate;
	private String author;
	private String message;
	private MessageList messageList;
	
	public Message(String message){
		this.message = message;
		author = "Lorik";
		sendDate = MyDate.curDate();
		MessageList.getInstance().addMessage(this);
	}
	public Message(String message,String author){
		this.message = message;
		this.author = author;
		sendDate = MyDate.curDate();
		MessageList.getInstance().addMessage(this);
	}
	
	public String sendMessage(){
		String messageSend = "("+MyDate.formatTime(sendDate)+") "+author+": "+message;
		return messageSend;
	}
	
	public Calendar getSendDate(){
		return sendDate;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getMessage(){
		return message;
	}
}
