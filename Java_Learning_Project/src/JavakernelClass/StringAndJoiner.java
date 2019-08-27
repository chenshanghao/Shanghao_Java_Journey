package JavakernelClass;

import java.util.StringJoiner;

public class StringAndJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Bob", "Alice", "Grace"};
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Hello ");
		
		for(String name: names) {
			sb1.append(name).append(", ");
		}
		
//		注意去掉最后的", ":
		sb1.delete(sb1.length() - 2, sb1.length());
		sb1.append("!");
		System.out.println(sb1.toString());
		
		StringJoiner sj1 = new StringJoiner(", ", "Hello ", "!");
		for (String name: names) {
			sj1.add(name);
		}
		System.out.println(sj1.toString());
		
		String sjoin = String.join(", ", names);
		System.out.println(sjoin);
		
		
		
	}

}
