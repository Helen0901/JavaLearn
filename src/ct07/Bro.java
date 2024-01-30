package ct07;

public class Bro {
	
	private String name;
	private int high;
	private String skin;
	
	public Bro() {
	
	}
	
	public Bro(String name) {
		
		this.name = name;
	}
	
	public Bro(String name,int high,String skin) {
		
		this.name = name;
		this.high = high;
		this.skin = skin;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin){
		this.skin = skin;
	}
	

}
