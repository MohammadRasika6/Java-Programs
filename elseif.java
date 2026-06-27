public class Main {
    public static void main(String[] args) {
      int number = 45;
      if (number < 12) {
        System.out.println("Free Ticket");
      } else if(number >= 12 && number < 18) {
        System.out.println("10% Discount");
      } else if(number >= 18 && number <60) {
        System.out.println("5%  Discount");
      } else {
        System.out.println("Not Allowed");
      }
}
}
