package ct07;

public class objectCar {
	public static void main(String[]args) {
		
		Car car = new Car("toyota",180);
		
		System.out.println("model:"+ car.getModel());
		System.out.println("MaxSpeed"+ car.MaxSpeed());
	}

}
