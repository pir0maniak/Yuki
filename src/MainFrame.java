import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class MainFrame extends JFrame {
	
	private JLabel leftLabel;
	private JLabel rightLabel;
	private JLabel yukiImage;
	private YukiGame yukiGame;
	private ChatArea chatArea;
	
	public MainFrame(){
		this.getContentPane().setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocation(50, 50);
		createLeftLabel();
		createRightLabel();
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
		JTextArea sendArea = new JTextArea();
		sendArea.setLocation(10, 420);
		sendArea.setSize(380, 140);
		rightLabel.add(sendArea);
		JButton sendButton = new JButton();
		sendButton.setLocation(400, 420);
		sendButton.setSize(120, 140);
		sendButton.setText("Отправить");
		rightLabel.add(sendButton);
		this.add(rightLabel);
	}
	
	public void yukiEmotion(int i){
		
		switch(i){
		
		case 0:{
			yukiImage.setIcon(new ImageIcon("yukiDefault.jpg"));
		}
		}
	}

}
