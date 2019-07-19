package Array;
import java.util.Arrays;
public class multidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
            };
        System.out.println(ns.length); //3
        
        int[][] ns2 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
            };
        int[] arr0 = ns2[0];
        System.out.println(arr0.length);  //4
        
        int[][] ns3 = {
        		{ 1, 2, 3, 4 },
        		{ 5, 6},
        		{ 7, 8,	9}
        };
        for(int[] arr: ns3) {
        	for(int n: arr) {
                System.out.print(n);
                System.out.print(", ");
        	}
        	System.out.println();
        }
        
        System.out.println("****************************");
        System.out.println(Arrays.deepToString(ns3));
	}

}
