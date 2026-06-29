import java.util.Scanner;
public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		printSeason(month);
		sc.close();
	}
	
	public static void printSeason(int month) {
		switch(month) {
		case 1:
		case 2: 
	    case 12: System.out.println("Winter");
	    break;
	    case 3:
	    case 4: 
	    	case 5: System.out.println("Spring");
	    	break;
	    	case 6:
	    	case 7: 
	    	case 8: System.out.println("Summer");
	    	break;
	    	case 9:
	    	case 10: 
	    	case 11: System.out.println("Antumn");
	    	
		}
		
	}

}
