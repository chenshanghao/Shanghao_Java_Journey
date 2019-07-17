package Array;

public class IterateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ns = {1, 4, 9, 16, 25};
		for(int i = 0; i < ns.length; i++) {
			System.out.println(ns[i]);
		}
		
		for (int i: ns) {
			System.out.println(i);
		}
	}

}
