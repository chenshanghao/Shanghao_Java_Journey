package OOP_Basic;

//面向抽象编程的本质就是：
//
//1. 上层代码只定义规范（例如：abstract class Person）；
//2. 不需要子类就可以实现业务逻辑（正常编译）；
//3. 具体的业务逻辑由不同的子类实现，调用者并不关心

public class AbstractClass {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_5 p = new Student_5();
		p.run();
	}

}

abstract class Person_5{
	public abstract void run();
}

class Student_5 extends Person_5{
	@Override
	public void run() {
		System.out.println("Student.run");
	}
}

