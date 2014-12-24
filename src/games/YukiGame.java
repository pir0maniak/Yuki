package games;
import javax.swing.JLabel;


public class YukiGame extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int[][] xorResult;
	public YukiGame(){
		this.setLocation(0, 300);
		this.setSize(260,300);
	}
	
	public void gameCreate(JLabel game){
		this.add(game);
	}
	
	
}
