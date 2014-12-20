
public class YukiTTTbot {

	TicTacToe ttt;
	Integer tttArray[][];
	boolean g=true;
	
	private YukiTTTbot(TicTacToe ttt){
		this.ttt = ttt;	
	}
	
	
	public void go(){
		g=true;
		tttArray = ttt.getResult();
		if(ttt.getPlayerID()==1){
				winStrateg(1);
			}
		if(ttt.getPlayerID()==1){
			winStrateg(2);
		}
		if(ttt.getPlayerID()==1){
			defStrateg();
		}
		ttt.usebleTrue();
	}
	
	public static YukiTTTbot getYukiTTTbot(TicTacToe ttt){
		YukiTTTbot bot = new YukiTTTbot(ttt);
		return bot;
	}
	
	private void hod(int i){
		if(g){
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
		g = false;
		}
	}
	
	private void winStrateg(int id){
		int d;
		int k;
		int n = 0;
		for(int i = 0; i<2;i++){
			d = 0;
			k = 0;
			for(int l = 0; l<3;l++){
				if (tttArray[i][l]==id){
					d = d+1;
				}
				if (tttArray[l][i]==id){
					k = k+1;
				}
			}
			if (d==2){
				for (int m=0;m<3;m++){
					if (tttArray[i][m]==0){
						hod(Integer.parseInt(Integer.toString(i)+Integer.toString(m)));
						break;
					}
				}
			}
			if (k==2){
				for (int m=0;m<3;m++){
					if (tttArray[m][i]==0){
							hod(Integer.parseInt(Integer.toString(m)+Integer.toString(i)));
							break;
						}
					}
			}
			if (tttArray[i][i]==id){
				n = n+1;
			}
			if (n==2){
				for (int m=0;m<3;m++){
					if (tttArray[m][m]==0){
							hod(Integer.parseInt(Integer.toString(m)+Integer.toString(m)));
							break;
						}
					}
			}
		}
		
//		if ((tttArray[0][2]+tttArray[1][1]+tttArray[2][0])==id*2){
//			if(tttArray[0][2]<1){
//				hod(Integer.parseInt(Integer.toString(0)+Integer.toString(2)));
//			}
//			else{
//				if(tttArray[1][1]<1){
//					hod(Integer.parseInt(Integer.toString(1)+Integer.toString(1)));
//				}
//				else{
//					hod(Integer.parseInt(Integer.toString(2)+Integer.toString(0)));
//				}
//			}
//		}
	
	}
	
	private void defStrateg(){
		for(int i = 0; i<3;i++){
			for(int l = 0; l<3;l++){
				if (tttArray[i][l]==0){
					hod(Integer.parseInt(Integer.toString(i)+Integer.toString(l)));
					break;
				}
			}
		}
	}
}
