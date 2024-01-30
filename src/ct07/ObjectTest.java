package ct07;

public class ObjectTest {

	public final float p = 3.1415623f;
	
	public static void main(String[] args) {
		
		
		Dog myDog = new Dog("tony", 2, "black");
		System.out.println(myDog.name);
		myDog.name = "newTony";
		System.out.println(myDog.name);
		myDog.setAge(100);
		
		System.out.println(myDog.getAge());
		myDog.eat();
		Dog youDog = new Dog("tony", 2, "black");
		System.out.println(youDog.name);
		System.out.println(youDog.age);
		youDog.run();
	}

	public static void eat() {
		
	}
}
