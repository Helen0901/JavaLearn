package ct07;

public class objectPet1 {
	public static void main(String[] args) {
		pet cat = new pet("mimi",2);
		pet dog = new pet("dog", 5);
		System.out.println("cat name:"+cat.getName()+"/cat age:"+cat.getAge());
		System.out.println("dog name:"+dog.getName()+"/dog age:"+dog.getAge());
	}

}
