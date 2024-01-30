package ct07;

public class zoo {
	private  int maxAnimals;
	private Animal[] animals;
	private int currentAnimalCount;
	
	public zoo(int maxAnimals) {
		this.maxAnimals = maxAnimals;
		this.animals = new Animal[maxAnimals];
		this.currentAnimalCount = 0;
	}
	public void addAnimal(Animal animal) {
		if (currentAnimalCount < maxAnimals) {
            animals[currentAnimalCount] = animal;
            currentAnimalCount++;
            System.out.println(animal.getSpecies() + " 動物園に追加成功！");
        } else {
            System.out.println("動物園はいっぱいで、新しい動物を追加することはできません");
        }
	}
	 public void displayAnimals() {
	        if (currentAnimalCount == 0) {
	            System.out.println("動物園には動物がいません");
	        } else {
	            System.out.println("動物園の動物：");
	            for (int i = 0; i < currentAnimalCount; i++) {
	                Animal animal = animals[i];
	                System.out.println("species: " + animal.getSpecies() +
	                                   ", age: " + animal.getAge() +
	                                   ", healthStatus: " + animal.getHealthStatus());
	            }
	        }
	    }

}

