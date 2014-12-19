import java.sql.Time;
import java.time.DateTimeException;
import java.util.Date;
import java.util.concurrent.TimeoutException;

import javax.naming.TimeLimitExceededException;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;
import javax.swing.JFrame;


public class Yukityan {

	MainFrame chat;
	
	public Yukityan(MainFrame chat){
		this.chat = chat;
	}
	
	public void answerYuki(Message message){
		String messageContent = message.getMessage().toLowerCase();
		if (messageContent.equals("привет")){
			String ans = "Привет, "+message.getAuthor();
			send(ans);
			chat.yukiEmotion(1);
		}
		if (messageContent.contains("поиграем")){
			String ans = "Давай)";
			send(ans);
			chat.yukiEmotion(3);
			playTicTac();
		}
		if (messageContent.contains("разбуди")){
			send("Хорошо)");
			chat.yukiEmotion(2);
			Alarm a = new Alarm(messageContent);
			a.go();
		}
		if (messageContent.contains("жопа")){
			int ans = Integer.getInteger(messageContent);
			send(Integer.toString(ans));
			chat.yukiEmotion(3);
			playTicTac();
		}
		
	}
	
	private void send(String ans){
		Message answer = new Message(ans, "Yuki");
		chat.chatArea.setText(chat.chatArea.getText()+answer.sendMessage()+"\n");
		
	}
	
	private void playTicTac(){
		TicTacToe ttt = new TicTacToe();
		chat.yukiGame.gameCreate(ttt);
		chat.repaint();
		YukiTTTbot bot = YukiTTTbot.getYukiTTTbot(ttt);
		ttt.addBot(bot);
	}
	
	
}
