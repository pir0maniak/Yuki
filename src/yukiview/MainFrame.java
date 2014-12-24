package yukiview;
import games.YukiGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import yukimodel.Message;
import yukimodel.Yukityan;


public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel leftLabel;
	private JLabel rightLabel;
	private JLabel yukiImage;
	public YukiGame yukiGame;
	public ChatArea chatArea;
	private JTextArea sendArea;
	private Yukityan yukityan;
	private String author;
	
	
	public MainFrame(){
		this.setTitle("Yuki 1.0");
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocation(50, 50);
		this.setResizable(false);
		createLeftLabel();
		createRightLabel();
		yukityan = new Yukityan(this);
		author = JOptionPane.showInputDialog(this,"Как к вам обращаться ?","Представьтесь",JOptionPane.QUESTION_MESSAGE);
		if (author.equals("")||(author==null)){
			author = "Неизвестный";
		}
	}
	
	private void createLeftLabel(){
		leftLabel = new JLabel();
		leftLabel.setLayout(null);
		leftLabel.setLocation(0, 0);
		leftLabel.setSize(260, 600);
		yukiImage = new JLabel();
		yukiImage.setSize(220, 220);
		yukiImage.setLocation(20, 20);
		yukiEmotion(0);
		yukiGame = new YukiGame();
		leftLabel.add(yukiGame);
		leftLabel.add(yukiImage);
		this.add(leftLabel);
	}
	
	private void createRightLabel(){
		rightLabel = new JLabel();
		rightLabel.setLayout(null);
		rightLabel.setLocation(260, 0);
		rightLabel.setSize(540, 600);
		chatArea = new ChatArea();
		rightLabel.add(chatArea);
		sendArea = new JTextArea();
		sendArea.setLocation(10, 420);
		sendArea.setSize(380, 140);
		sendArea.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getExtendedKeyCode() == 10){
					sendMessage(sendArea.getText().substring(0, sendArea.getText().length()-1));
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		rightLabel.add(sendArea);
		JButton sendButton = new JButton();
		sendButton.setLocation(400, 420);
		sendButton.setSize(120, 140);
		sendButton.setText("Отправить");
		sendButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sendMessage(sendArea.getText());
			}
		});
		rightLabel.add(sendButton);
		this.add(rightLabel);
	}
	
	public void yukiEmotion(int i){
		
		switch(i){
		
		case 0:{
			yukiImage.setIcon(new ImageIcon("yukiDefault.jpg"));
			break;
		}
		case 1:{
			yukiImage.setIcon(new ImageIcon("yukiTongue.jpg"));
			break;
		}
		case 2:{
			yukiImage.setIcon(new ImageIcon("yukiLaughs.jpg"));
			break;
		}
		case 3:{
			yukiImage.setIcon(new ImageIcon("yukiAngry.jpg"));
			break;
		}
		case 4:{
			yukiImage.setIcon(new ImageIcon("yukiSad.jpg"));
			break;
		}
		}
	}
	
	private void sendMessage(String mess){
		Message message = new Message(mess,author);
		chatArea.setText(chatArea.getText()+message.sendMessage()+"\n");
		sendArea.setText(null);
		yukityan.answerYuki(message);
	}

}
