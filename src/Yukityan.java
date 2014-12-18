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
		if (messageContent.equals("поиграем?")){
			String ans = "Давай)";
			send(ans);
			chat.yukiEmotion(3);
			playTicTac();
		}
		
	}
	
	public void send(String ans){
		Message answer = new Message(ans, "Yuki");
		chat.chatArea.setText(chat.chatArea.getText()+answer.sendMessage()+"\n");
		
	}
	
	public void playTicTac(){
		TicTacToe ttt = new TicTacToe();
		chat.yukiGame.gameCreate(ttt);
		chat.repaint();
	}
}
