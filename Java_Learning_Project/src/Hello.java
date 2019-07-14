
public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello World");

//		Interger Type
		int i = 123123;
		int i2 = -2124141;
//		int i3 = 2_000_000;
		int i4 = 0xff0000;
		int i5 = 0b1000000;
		long l = 90000000000000L;

//		Float Type
		float f1 = 3.14f;
		float f2 = 3.14e38f;
		double d = 1.79e308;
		double d2 = -1.79e308;
		double d3 = 4.9e-324;

//		Boolean Type
		boolean b1 = true;
		boolean b2 = false;
		boolean isGreater = 5 > 3; // result = false
		int age = 12;
		boolean isAdult = age >= 18; // result = false

//		Character Type
		char a = 'A';
		char zh = '中';
		System.out.println(a);
		System.out.println(zh);

//      Constant number (avoid Magic Number)
		final double PI = 3.14;
		double r = 5.0;
		double area = PI * r * r;

//		Four operations
		int operations_i = (100 + 200) * (99 - 88);
		int operations_n = 7 * (5 + (i - 9));
		System.out.println(operations_i);
		System.out.println(operations_n);
		
//		Overflow
		int Overflow_x = 2147483640;
		int Overflow_y = 15;
		int Overflow_sum = Overflow_x + Overflow_y;
		System.out.println(Overflow_sum);
		System.out.println("Overflow_sum: " + Overflow_sum);
		
//		auto-increment, decrement
		int auto_n = 3300;
		auto_n++;   // auto_n += 1
		auto_n--;   // auto_n -= 1
		int auto_y = 100 + (++auto_n); // Don't write code like this
		System.out.println("auto_y: " + auto_y);

//		shifting operation
		int shift_n = 7;       // 00000000 0000000 0000000 00000111
		int shift_a = shift_n << 1;  // 00000000 0000000 0000000 00001110 <= 14
		int shift_b = shift_n << 2;  // 00000000 0000000 0000000 00011100 <= 28
		int shift_c = shift_n << 28; // 01110000 0000000 0000000 00000000 <= 1879048192
		int shift_d = shift_n << 29; // 11100000 0000000 0000000 00000000 <= -536870912

//		Bit operation
		int bit_n = 0 & 0;
		// and
		bit_n = 0 & 1;
		bit_n = 1 & 0;
		bit_n = 1 & 1;
		// or
		bit_n = 0 | 0;
		bit_n = 0 | 1;
		// xor
		bit_n = 0 ^ 0;
		bit_n = 1 ^ 0;
		
// 		type conversion
        int type_i1 = 1234567;
        short type_s1 = (short) type_i1; // -10617
        System.out.println("type_s1: " + type_s1);
        int type_i2 = 12345678;
        short type_s2 = (short) type_i2; // 24910
        System.out.println("type_s1: " + type_s2);	
        
//      Float Operation
        double float_x = 1.0 / 10;
        double float_y = 1 - 9.0 / 10;
        System.out.println("float_x: " + float_x);
        System.out.println("float_y: " + float_y);
        double abs_r = Math.abs(float_x - float_y);
        if (abs_r < 0.00001) {
        	System.out.println("float_x = float_y");
        } else {
        	System.out.println("float_x != float_y");
        }
        
//       Float operation overflow
        double float_d1 = 0.0 / 0; // NaN
        double float_d2 = 1.0 / 0; // Infinity
        double float_d3 = -1.0 / 0; // -Infinity
        System.out.println("float_d1: " + float_d1);
        System.out.println("float_d2: " + float_d2);
        System.out.println("float_d3: " + float_d3);
        
//       type conversion
        int type_n1 = (int) 12.3; // 12
        int type_n2 = (int) 12.7; // 12
        type_n2 = (int) -12.7; // 12
        int type_n3 = (int) (12.7 + 0.5); // 13
        int type_n4 = (int) 1.2e20; // 2147483647 在转型时，浮点数的小数部分会被丢掉。如果转型后超过了整型能表示的最大范围，将返回整型的最大值		
		
	}
}
