import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;


public class TicTacToe extends JLabel {

	JButton b00;
	JButton b01;
	JButton b02;
	JButton b10;
	JButton b11;
	JButton b12;
	JButton b20;
	JButton b21;
	JButton b22;
	private Integer tttResult[][] = new Integer[3][3];
	private int playerId = 0;
	private boolean useble;
	private YukiTTTbot bot;
	
	public TicTacToe(){
		this.setLocation(0, 0);
		this.setSize(260,300);
		b00 = new JButton();
		b00.setSize(80, 80);
		b00.setLocation(10, 10);
		b00.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (useble){
					klick(0,b00);
					useble = false;
				}
			}
		});
		this.add(b00);
		
		b01 = new JButton();
		b01.setSize(80, 80);
		b01.setLocation(90, 10);
		b01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (useble){
					klick(1,b01);
					useble = false;
				}
			}
		});
		this.add(b01);
		
		b02 = new JButton();
		b02.setSize(80, 80);
		b02.setLocation(170, 10);
		b02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (useble){
					klick(2,b02);
					useble = false;
				}
			}
		});
		this.add(b02);
		
		b10 = new JButton();
		b10.setSize(80, 80);
		b10.setLocation(10, 90);
		b10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (useble){
					klick(1,b10);
					useble = false;
				}
			}
		});
		this.add(b10);
		
		b11 = new JButton();
		b11.setSize(80, 80);
		b11.setLocation(90, 90);
		b11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (useble){
					klick(11,b11);
					useble = false;
				}
			}
		});
		this.add(b11);
		
		b12 = new JButton();
		b12.setSize(80, 80);
		b12.setLocation(170, 90);
		b12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (useble){
					klick(12,b12);
					useble = false;
				}
			}
		});
		this.add(b12);
		
		b20 = new JButton();
		b20.setSize(80, 80);
		b20.setLocation(10, 170);
		b20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (useble){
					klick(20,b20);
					useble = false;
				}
			}
		});
		this.add(b20);
		
		b21 = new JButton();
		b21.setSize(80, 80);
		b21.setLocation(90, 170);
		b21.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (useble){
					klick(21,b21);
					useble = false;
				}
			}
		});
		this.add(b21);
		
		b22 = new JButton();
		b22.setSize(80, 80);
		b22.setLocation(170, 170);
		b22.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (useble){
					klick(22,b22);
					useble = false;
				}
			}
		});
		this.add(b22);
		
		useble = true;
		reloadResult();
	}
	
	public Integer[][] getResult(){
		return this.tttResult;
	}
	
	public void klick(int i, JButton b){
		
		switch(i){
		case 0:{
			tttResult[0][0]=playerId;
			break;
		}
		case 1:{
			tttResult[0][1]=playerId;
			break;
		}
		case 2:{
			tttResult[0][2]=playerId;
			break;
		}
		case 10:{
			tttResult[1][0]=playerId;
			break;
		}
		case 11:{
			tttResult[1][1]=playerId;
			break;
		}
		case 12:{
			tttResult[1][2]=playerId;
			break;
		}
		case 20:{
			tttResult[2][0]=playerId;
			break;
		}
		case 21:{
			tttResult[2][1]=playerId;
			break;
		}
		case 22:{
			tttResult[2][2]=playerId;
			break;
		}
		}
		String tic = "";
		if (playerId == 1){
			tic = "x";
			playerId = 2;
			
		}
		else{
			tic ="0";
			playerId = 1;
			bot.go();
		}
		b.setText(tic);
		b.setEnabled(false);
	}
	
	public void reloadResult(){
		int i;
		int l;
		for (i=0;i<2;i++){
			for (l=0;l<2;l++){
				tttResult[i][l]=0;
			}
		}
	}
	
	public void usebleTrue(){
		useble = true;
	}
	public int getPlayerID(){
		return playerId;
	}
	
	public void addBot(YukiTTTbot bot){
		this.bot = bot;
	}
}
