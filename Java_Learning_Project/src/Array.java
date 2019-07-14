
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5位学生的成绩:
		int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        System.out.println("ns.length: " + ns.length);
//      Java的数组有几个特点：
//        1) 数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
//        2) 数组一旦创建后，大小就不可改变。
//        3) 要访问数组中的某一个元素，需要使用索引。数组索引从0开始，例如，5个元素的数组，索引范围是0~4。
//        可以修改数组中的某一个元素，使用赋值语句，例如，ns[1] = 79;。
        
//        也可以在定义数组时直接指定初始化的元素，这样就不必写出数组大小，而是由编译器自动推算数组大小。例如：
        int[] ns_2 = new int[] { 68, 79, 91, 85, 62 };
        
//        Moreover
        int[] ns_3 = { 68, 79, 91, 85, 62 };
        
//      String Array
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?

	}

}
