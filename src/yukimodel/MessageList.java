package yukimodel;






import java.util.ArrayList;
import java.util.Observable;

import yukiview.ChatArea;
import yukiview.MainFrame;

public class MessageList extends Observable{

		private ArrayList<Message> messageList = new ArrayList<Message>();
		private static MessageList instance;
		
		private MessageList(ChatArea observer){
			this.addObserver(observer);
		}
		
		public void addMessage(Message m){
			messageList.add(m);
			super.setChanged();
			this.notifyObservers();			
		}
		
		public Message getLastMessage(){
			
			Message message = messageList.get(messageList.size()-1);
			return message;
		}
		
		public static MessageList getInstance(){
			if (instance==null){
				System.out.print("MessageList do not created");
			}
			return instance;
		}
		
		public static void createMessageList(ChatArea observer){
			if (instance==null){
			instance = new MessageList(observer);
			}
		}
}
