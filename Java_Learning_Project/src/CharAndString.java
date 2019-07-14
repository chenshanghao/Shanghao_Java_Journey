
public class CharAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Character Type
		char c1 = 'A';
		char c2 = '中';
		int n1 = 'A';
		int n2 = '中';
		System.out.println("c1: " + c1 + " c2: " + c2 + " n1: " + n1 + " n2: " + n2); 

// String Type
		String s0 = ""; // 空字符串，包含0个字符
		String s1 = "A"; // 包含一个字符
		String s2 = "ABC"; // 包含3个字符
		String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格
		String s4 = "abc\"xyz"; // 包含7个字符: a, b, c, ", x, y, z
		
//		String immutable
        String immutable_s = "hello";
        String t = immutable_s;
        immutable_s = "world";
        System.out.println("immutable_s: " + immutable_s); // 显示 hello
        System.out.println("t: " + t); // 显示 world
        
//      Null Value
        String null_s1 = null; // s1是null
        String null_s2; // 没有赋初值值，s2也是null
        String null_s3 = s1; // s3也是null
        String null_s4 = ""; // s4指向空字符串，不是null
		
	}

}
