package FlowControl;

public class IfJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 70;
		if (n >= 90) {
			System.out.println("优秀");
		} else if (n > 60) {
			System.out.println("及格了");
		} else {
			System.out.println("挂科了");
		}
		System.out.println("END");
		
		double x = 1 - 9.0 / 10;
		if (Math.abs(x - 0.1) < 0.00001) {
			System.out.println("X is 0.1");
		} else {
			System.out.println("X is Not 0.1");
		}
		
		String s1 = "hello";
		String s2 = "Hello".toLowerCase();
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		if (s1 == s2){
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		if (s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}else {
			System.out.println("s1 not equals s2");
		}
		
//		注意：执行语句s3.equals(s2)时，如果变量s3为null，会报NullPointerException：
//		要避免NullPointerException错误，可以利用短路运算符&&：
		String s3 = null;
//		if (s3.equals(s1)) {
		if (s3 != null && s3.equals(s1)){
			System.out.println("Hello");
		}



	}

}
