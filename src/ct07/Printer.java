package ct07;

public class Printer {
	
	public String name;
	
	public String color;
	
	public int money;
	
	
	public Printer(String name,int money,String color) {
		this.name = name;
		this.money = money;
		this.color= color;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
