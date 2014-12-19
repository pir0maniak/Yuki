
public class YukiTTTbot {

	TicTacToe ttt;
	Integer tttArray[][];
	
	private YukiTTTbot(TicTacToe ttt){
		this.ttt = ttt;	
	}
	
	
	public void go(){
		boolean gameOver = false;
		if(ttt.getPlayerID()==1){
				tttArray = ttt.getResult();
				hod(2);
			}
	}
	
	public static YukiTTTbot getYukiTTTbot(TicTacToe ttt){
		YukiTTTbot bot = new YukiTTTbot(ttt);
		return bot;
	}
	
	private void hod(int i){
		switch(i){
		case 0:{
			ttt.klick(0, ttt.b00);
			break;
		}
		case 1:{
			ttt.klick(1, ttt.b01);
			break;
		}
		case 2:{
			ttt.klick(2, ttt.b02);
			break;
		}
		case 10:{
			ttt.klick(10, ttt.b10);
			break;
		}
		case 11:{
			ttt.klick(11, ttt.b11);
			break;
		}
		case 12:{
			ttt.klick(12, ttt.b12);
			break;
		}
		case 20:{
			ttt.klick(20, ttt.b20);
			break;
		}
		case 21:{
			ttt.klick(21, ttt.b21);
			break;
		}
		case 22:{
			ttt.klick(22, ttt.b22);
			break;
		}
		}
	}
}
