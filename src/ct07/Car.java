package ct07;

public class Car {
	
	public String model;
	public int maxSpeed;
	
	public Car(String model,int MaxSpeed) {
	this.model = model;
	this.maxSpeed = MaxSpeed;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String Model) {
		this.model = Model;
	}
	public int MaxSpeed() {
		return maxSpeed;
	}
	public void MaxSpeed(int MaxSpeed) {
		this.maxSpeed = MaxSpeed;
	}
	
}
