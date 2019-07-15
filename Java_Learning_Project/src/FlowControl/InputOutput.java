package FlowControl;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("A, ");
		System.out.print("B, ");
		System.out.print("C.");
        System.out.println();
        System.out.println("END");
        System.out.println("***************************");
        
        double d = 12900000;
        System.out.println(d); // 1.29E7
        
        System.out.println("***************************");
        d = 3.1415926;
        System.out.printf("%.2f\n", d); // 显示两位小数3.14
        System.out.printf("%.4f\n", d); // 显示4位小数3.1416
        
        System.out.println("***************************");
//        占位符	说明
//        %d	格式化输出整数
//        %x	格式化输出十六进制整数
//        %f	格式化输出浮点数
//        %e	格式化输出科学计数法表示的浮点数
//        %s	格式化字符串
        
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x\n", n, n); // 注意，两个%占位符必须传入两个数

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.print("Input you age: ");
        int age = scanner.nextInt();
        System.out.printf("Hi, %s, you are %d\n", name, age);
        
	}

}
