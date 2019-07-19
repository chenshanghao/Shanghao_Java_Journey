package Array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		// Before Sorting
		System.out.println(Arrays.toString(ns));
		for(int i=0; i < ns.length - 1; i++) {
			for(int j=0; j<ns.length-i-1; j++) {
                if (ns[j] > ns[j+1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
			}
		}
		System.out.println(Arrays.toString(ns));
		
		
		int[] ns2 = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		Arrays.sort(ns2);
		System.out.println(Arrays.toString(ns2));
	}

}
