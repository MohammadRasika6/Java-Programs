import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner();
      byte userid = sc.nextByte();
      short age = sc.nextShort();
      int phoneNumber = sc.nextInt();
      long nationalId = sc.nextLong();
      float height = sc.nextFloat();
      double  weight = sc.nextDouble();
      char gender = sc.next().charAt(0);
      boolean isMarried = sc.nextBoolean();
      sc.nextLine();
      String name = sc.nextLine();
      System.out.println("User Information");
      System.out.println("User ID: " + userid);
      System.out.println("Age: " + age);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("National ID: " + nationalId);
    System.out.println("Height: " + height);
    System.out.println("Weight: " + weight);
    System.out.println("Gender: " + gender);
    System.out.println("Married Status: " + isMarried);
    System.out.println("User Name: " + name);
}
}
