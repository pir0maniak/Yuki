import java.text.SimpleDateFormat;
import java.util.Date;


public class Message {

	private Date sendDate;
	private String author;
	private String message;
	
	public Message(String message){
		this.message = message;
		author = "Lorik";
		long a = System.currentTimeMillis();
		sendDate = new Date(a);
	}
	public Message(String message,String author){
		this.message = message;
		this.author = author;
		long a = System.currentTimeMillis();
		sendDate = new Date(a);
	}
	
	public String sendMessage(){
		String messageSend = "("+timeFormater()+") "+author+": "+message;
		return messageSend;
	}
	
	private String timeFormater(){
		
		String curStringDate = new SimpleDateFormat("HH:mm").format(sendDate);
		return curStringDate;
	}
	
	public Date getSendDate(){
		return sendDate;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getMessage(){
		return message;
	}
}
