package OOP_Basic;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 p = new Person3("Shanghao", 30);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}

class Person3{
	private String name;   // 默认初始化为null
	private int age;      // 默认初始化为0
	
//	Default Constructor
	public Person3() {
	}
	
	public Person3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
}


class Person2{
	private String name;
	private int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person2(String name) {
		this(name, 18); // 调用另一个构造方法Person(String, int)
	}
	
	public Person2() {
		this("Unamed"); // 调用另一个构造方法Person(String)
	}
}