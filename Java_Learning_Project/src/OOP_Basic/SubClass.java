package OOP_Basic;

public class SubClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
