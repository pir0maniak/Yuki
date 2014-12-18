
public class Emotion {

	private String name;
	private int value;
	private int id;
	
	public Emotion(String name, int value){
		this.name = name;
		this.value = value;
	}
	
	public String getName(){
		return name;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int i){
		
		this.value = i;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
