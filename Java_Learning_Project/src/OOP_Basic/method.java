package OOP_Basic;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ming = new Person();
		ming.setName("Shanghao Chen");
		ming.setBirth(1989);
		System.out.println(ming.getName() + ", " + ming.getAge());
		
	}
	
}

class Person{
	private String name;
//	private	int age;
	private int birth;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("invalid name");
		}
		this.name = name.trim();
	}
	
	public void setBirth(int birth){
		this.birth = birth;
	}
	
	public int getAge() {
		return calcAge(2019);
	}
	
	private int calcAge(int currentYear) {
		System.out.println("currentYear: " + currentYear + " birth:" + this.birth);
		return currentYear - this.birth;
	}
	
//	public void setAge(int age) {
//		if (age < 10 || age > 100) {
//			throw new IllegalArgumentException("invalid age value");
//		}
//		this.age = age;
//	}
	
}

