package JavakernelClass;

public class StringAndBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		System.out.println(s);
		s = s.toUpperCase();
		System.out.println(s);
		
		String s1 = "hello";
		String s2 = "hello";
		System.out.println("s1 == s2: " + s1 == s2);
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		
		String s3 = "hello";
		String s4 = "HELLO".toLowerCase();
		System.out.println("s3 == s4: " + s3 == s4);
		System.out.println("s3.equals(s4)" + s3.equals(s4));
		
		// 搜索子串
		System.out.println("Hello".contains("11"));
		System.out.println("Hello".lastIndexOf("l"));
		System.out.println("Hello".startsWith("He"));
		System.out.println("Hello".endsWith("lo"));
		
		// 提取子串
		System.out.println("Hello".substring(2));
		System.out.println("Hello".substring(2, 4));
		
		// 转换为char[]
        char[] cs = "Hello".toCharArray();
        String s5 = new String(cs);
        System.out.println(s5);
        cs[0] = 'X';
        System.out.println(s5);
        
        StringBuilder sb = new StringBuilder(1024);
        sb.append("Mr ").append("Bob").append("!").insert(0, "Hello, ");
        System.out.println(sb.toString());
		
        Adder adder = new Adder();
        adder.add(3).add(5).inc().add(10);
        System.out.println(adder.value());
	}
}

class Adder{
	private int sum = 0;
	
	public Adder add(int n) {
		sum += n;
		return this;
	}
	
	public Adder inc() {
		sum ++;
		return this;
	}
	
	public int value() {
		return sum;
	}	
}
