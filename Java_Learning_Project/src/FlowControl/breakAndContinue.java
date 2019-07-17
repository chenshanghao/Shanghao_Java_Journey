package FlowControl;

public class breakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=1; ; i++) {
			sum = sum + i;
			if (i == 100) {
				break;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("begin i = " + i);
			if (i % 2 == 0) {
				continue;
			}
			sum += i;
			System.out.println("end i = " + i);
		}
		System.out.println(sum);

	}

}
