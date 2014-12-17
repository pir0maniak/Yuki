import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;


public class EmotionMonitor extends JDialog {
	
	private Emotions emo;
	private JProgressBar veselie;
	private JProgressBar goodnastroi;
	private JProgressBar schastie;
	private JProgressBar napryag;
	private JProgressBar zdorovie;
	private JProgressBar vzvolnovonnost;
	private JProgressBar bodrost;
	private JProgressBar zlost;
	
	public EmotionMonitor(Emotions emo){
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.emo = emo;
		this.getContentPane().setLayout(null);
		this.setResizable(false);
		this.setSize(405, 200);
		this.setLocation(50, 50);
		veselie = new JProgressBar(SwingConstants.VERTICAL);
		veselie.setSize(40, 150);
		veselie.setLocation(5, 10);
		veselie.setStringPainted(true);
		goodnastroi = new JProgressBar(SwingConstants.VERTICAL);
		goodnastroi.setSize(40, 150);
		goodnastroi.setLocation(55, 10);
		goodnastroi.setStringPainted(true);
		schastie = new JProgressBar(SwingConstants.VERTICAL);
		schastie.setSize(40, 150);
		schastie.setLocation(105, 10);
		schastie.setStringPainted(true);
		napryag = new JProgressBar(SwingConstants.VERTICAL);
		napryag.setSize(40, 150);
		napryag.setLocation(155, 10);
		napryag.setStringPainted(true);
		zdorovie = new JProgressBar(SwingConstants.VERTICAL);
		zdorovie.setSize(40, 150);
		zdorovie.setLocation(205, 10);
		zdorovie.setStringPainted(true);
		vzvolnovonnost = new JProgressBar(SwingConstants.VERTICAL);
		vzvolnovonnost.setSize(40, 150);
		vzvolnovonnost.setLocation(255, 10);
		vzvolnovonnost.setStringPainted(true);
		bodrost = new JProgressBar(SwingConstants.VERTICAL);
		bodrost.setSize(40, 150);
		bodrost.setLocation(305, 10);
		bodrost.setStringPainted(true);
		zlost = new JProgressBar(SwingConstants.VERTICAL);
		zlost.setSize(40, 150);
		zlost.setLocation(355, 10);
		zlost.setStringPainted(true);
		this.add(goodnastroi);
		this.add(schastie);
		this.add(napryag);
		this.add(zdorovie);
		this.add(vzvolnovonnost);
		this.add(bodrost);
		this.add(zlost);
		this.add(veselie);
		refreshProgresBar();
		this.setVisible(true);
	}
	
	public void refreshProgresBar(){
		veselie.setValue(emo.veselie.getValue());
		veselie.setString(emo.veselie.getName()+" "+Integer.toString(veselie.getValue())+"%");
		goodnastroi.setValue(emo.goodnastroenie.getValue());
		goodnastroi.setString(emo.goodnastroenie.getName()+" "+Integer.toString(goodnastroi.getValue())+"%");
		schastie.setValue(emo.schastie.getValue());
		schastie.setString(emo.schastie.getName()+" "+Integer.toString(schastie.getValue())+"%");
		napryag.setValue(emo.napryag.getValue());
		napryag.setString(emo.napryag.getName()+" "+Integer.toString(napryag.getValue())+"%");
		zdorovie.setValue(emo.zdorovie.getValue());
		zdorovie.setString(emo.zdorovie.getName()+" "+Integer.toString(zdorovie.getValue())+"%");
		vzvolnovonnost.setValue(emo.vzvolnovannost.getValue());
		vzvolnovonnost.setString(emo.vzvolnovannost.getName()+" "+Integer.toString(vzvolnovonnost.getValue())+"%");
		bodrost.setValue(emo.bodrost.getValue());
		bodrost.setString(emo.bodrost.getName()+" "+Integer.toString(bodrost.getValue())+"%");
		zlost.setValue(emo.zlost.getValue());
		zlost.setString(emo.zlost.getName()+" "+Integer.toString(zlost.getValue())+"%");
		
	}

}
