
public class BooleanOperation {
	public static void main(String[] args) {
		boolean isGreater = 5 > 3; // true
		int age = 12;
		boolean isZero = age == 0;	// false
		boolean isNonZero = !isZero;	// true
		boolean isAdult = age >= 18;	//	false
		boolean isTeenager = age > 6 && age < 18;	//	true
		
//		Short-circuit evaluation 短路运算
		boolean b = 5 > 3;
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// Not catch since Short-circuit evaluation
		System.out.println( "(5 / 0 > 0) " + "Not catch since Short-circuit evaluation");
		boolean result = true || (5 / 0 > 0); // true
		System.out.println(result);
		
//		ternary operator  三元运算
		int ternary_n = -100;
		int ternary_x = ternary_n >= 0? ternary_n: -ternary_n;
		System.out.println("ternary_x: "+ ternary_x);


	}
}
