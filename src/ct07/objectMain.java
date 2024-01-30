package ct07;

public class objectMain {
	public static void main(String[]args) {
		
		Animal lion = new Animal("ライオン", 5, "健康");
		Animal elephant = new Animal("ゾウ", 10, "病気");
		
		ct07.zoo zoo = new zoo(5);
		
		zoo.addAnimal(lion);
		zoo.addAnimal(elephant);
		zoo.displayAnimals();
	}
}
