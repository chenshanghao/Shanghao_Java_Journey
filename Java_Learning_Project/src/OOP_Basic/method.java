package OOP_Basic;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ming = new Person();
		ming.setName("Shanghao Chen");
		ming.setAge(12);
		System.out.println(ming.getName() + ", " + ming.getAge());
		
	}
	
}

class Person{
	private String name;
	private	int age;
	
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
		if (age < 10 || age > 100) {
			throw new IllegalArgumentException("invalid age value");
		}
		this.age = age;
		
	}
	
}

