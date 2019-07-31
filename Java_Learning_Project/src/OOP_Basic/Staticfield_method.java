package OOP_Basic;

public class Staticfield_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person8 ming = new Person8("Shanghao Chen", 30);
		Person8 hong = new Person8("Xiaqing Lian", 28);
		ming.number = 88;
		System.out.println("hong.number: " + hong.number);
		hong.number = 99;
		System.out.println("ming.number: " + ming.number);
		
		System.out.println("Person8.number: " + Person8.number);
	}

}

class Person8{
	public String name;
	public int age;
	
	public static int number;
	
	public Person8(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
