import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
      checkMultipleOfFive(number);
    }
    public static void checkMultipleOfFive(int number) {
      if (number % 5 == 0) {
        System.out.println("Multiple of 5");
      }else {
        System.out.println("not multiple of 5");
    }
}
}
