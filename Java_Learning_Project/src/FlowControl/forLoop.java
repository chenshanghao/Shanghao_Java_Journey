package FlowControl;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);

		
		int[] ns = {1, 4, 9, 16, 25};
		sum = 0;
		for (int i = 0; i < ns.length; i++) {
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            sum = sum + ns[i];
		}
		System.out.println("sum = " + sum);
		
		for (int n: ns) {
			System.out.println(n);
		}
		
	}

}
