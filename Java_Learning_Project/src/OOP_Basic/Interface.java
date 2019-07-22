package OOP_Basic;

//
//					abstract class				interface
//继承			只能extends一个class			可以implements多个interface
//字段			可以定义实例字段				不能定义实例字段
//抽象方法		可以定义抽象方法				可以定义抽象方法
//非抽象方法		可以定义非抽象方法				可以定义default方法


//1. Java的接口（interface）定义了纯抽象规范，一个类可以实现多个接口；
//2. 接口也是数据类型，适用于向上转型和向下转型；
//3. 接口的所有方法都是抽象方法，接口不能定义实例字段；
//4. 接口可以定义default方法（JDK>=1.8）
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_8 p = new Student_8("Shanghao");
		p.run();
	}

}

interface Person_8{
	String getName();
	default void run() {
		System.out.println(getName() + " run");
	}
}

class Student_8 implements Person_8{
	private String name;
	
	public Student_8(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
