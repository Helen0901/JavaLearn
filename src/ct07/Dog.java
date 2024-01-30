package ct07;

public class Dog {

	public String name;

	public int age;

	public String color;

	//コンストラクタ（构造方法）
	//1.方法名与类名相同 2.初始化用 3.无返回值 4.一个类可以有多个构造方法
	public Dog() {

	}

	public Dog(String name, int age, String color) {

		this.name = name;
		this.age = age;
		this.color = color;
	}

	public void eat() {
		System.out.println(123);
	}

	public void run() {
		System.out.println(123 + "vasdghdshg");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	


}
