import javax.swing.JTextArea;


public class ChatArea extends JTextArea {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChatArea(){
		this.setLocation(10, 10);
		this.setSize(510, 400);
		this.setEditable(false);
	}
}
