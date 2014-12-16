import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


public class Emotions {

	public Emotion veselie;
	public Emotion goodnastroenie;
	public Emotion schastie;
	public Emotion napryag;
	public Emotion zdorovie;
	public Emotion vzvolnovannost;
	public Emotion bodrost;
	public Emotion zlost;
	private Element emotionData;
	
	public Emotions() throws Exception{
		loadEmotions();
	}
	
	private void loadEmotions() throws Exception{
		openXml(); 
		veselie = new Emotion(getEn(0), getEv(0));
		veselie.setId(0);
		goodnastroenie = new Emotion(getEn(1), getEv(1));
		goodnastroenie.setId(1);
		schastie = new Emotion(getEn(2), getEv(2));
		schastie.setId(2);
		napryag = new Emotion(getEn(3), getEv(3));
		napryag.setId(3);
		zdorovie = new Emotion(getEn(4), getEv(4));
		zdorovie.setId(4);
		vzvolnovannost = new Emotion(getEn(5), getEv(5));
		vzvolnovannost.setId(5);
		bodrost = new Emotion(getEn(6), getEv(6));
		bodrost.setId(6);
		zlost = new Emotion(getEn(7), getEv(7));
		zlost.setId(7);
		
		 
	}
	private void openXml() throws Exception {
        try {
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
            f.setValidating(false);
            DocumentBuilder builder = f.newDocumentBuilder();
            Document doc = builder.parse(new File("Emotions.xml"));
            emotionData = doc.getDocumentElement();
        } catch (Exception exception) {
            String message = "XML parsing error!";
            throw new Exception(message);
        }
	}
	
	private String getEn(int i){
		
		Element name = (Element)emotionData.getElementsByTagName("name").item(i);
		
		return name.getTextContent();
	}
	
	private int getEv(int i){
		Element val = (Element)emotionData.getElementsByTagName("value").item(i);
		
		 int value = Integer.parseInt(val.getTextContent());
		return value;
	}
	private void setEn(int i, String n){
		
		Element name = (Element)emotionData.getElementsByTagName("name").item(i);
		
		name.setTextContent(n);
	}
	
	private void setEv(int i,int n){
		Element val = (Element)emotionData.getElementsByTagName("value").item(i);
		
		val.setTextContent(Integer.toString(n));
	}
	
	public void getEmotion(Emotion e){
		System.out.println("уровень "+e.getName()+" - "+e.getValue());
	}
	
}
