package FlowControl;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 2;
		switch(option) {
			case 1:
				System.out.println("Selected 1");
				break;
			case 2:
			case 3:
				System.out.println("Selected 2, 3");
				break;
			default:
				System.out.println("Not Selected");
				break;
		}
		
	}

}
