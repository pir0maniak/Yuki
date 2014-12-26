package yukiview;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

import yukimodel.Message;
import yukimodel.MessageList;


public class ChatArea extends JTextArea implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChatArea(){
		this.setLocation(10, 10);
		this.setSize(510, 400);
		this.setEditable(false);
		MessageList.createMessageList(this);
	}
	
	private void sendMessage(Message message){
		this.setText(this.getText()+message.sendMessage()+"\n");
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.sendMessage(MessageList.getInstance().getLastMessage());
	}
}
