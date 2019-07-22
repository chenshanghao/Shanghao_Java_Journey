package OOP_Basic;

public class SubClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		小结
//		1) 继承是面向对象编程的一种强大的代码复用方式；
//		2）Java只允许单继承，所有类最终的根类是Object；
//		3) protected允许子类访问父类的字段和方法；
//		4）子类的构造方法可以通过super()调用父类的构造方法；
//		5) 可以安全地向上转型为更抽象的类型；
//		6) 可以强制向下转型，最好借助instanceof判断；
//		7) 子类和父类的关系是is，has关系不能用继承。
		
		Person_4 p = new Person_4("Shanghao", 30);
		System.out.println("p is instance of Person_4: "+  (p instanceof Person_4));
		
		Student s = new Student("Shanghao", 30, 100);
		System.out.println("s is instanceof Person_4: " + (s instanceof Person_4));
		System.out.println("s is instanceof Student: " + (s instanceof Student));
		
		Student n = null;
		System.out.println("n is instanceof Student: " + (n instanceof Student));
		
	}

}


class Person_4{
	protected String name;
	protected int age;
	
	public Person_4(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class Student extends Person_4{
	private int score;
	
//	在Java中，任何class的构造方法，第一行语句必须是调用父类的构造方法。如果没有明确地调用父类的构造方法，
//	编译器会帮我们自动加一句super();，所以，Student类的构造方法实际上是这样：
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String hello() {
		return ("Hello, " + super.name);
	}
}
