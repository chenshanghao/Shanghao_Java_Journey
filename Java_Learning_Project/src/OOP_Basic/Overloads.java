package OOP_Basic;

public class Overloads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Test string";
		int n1 = s.indexOf('t');
		int n2 = s.indexOf("st");
		int n3 = s.indexOf("st", 4);
		
		System.out.println("n1:" + n1 + " n2:" + n2 + " n3:" + n3);
	}
	

}
