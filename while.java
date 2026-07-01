public class while {

	public static void main(String[] args) {
		int number = 7;
		int factorail = 1;
		
		while (number > 0) {
			factorail *= number;
			number--;
		}
		System.out.println("Factorial: " + factorail);
		 }
	}


