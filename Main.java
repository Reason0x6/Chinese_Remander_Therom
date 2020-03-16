import java.util.*;

class Main {
  public static void main(String[] args) {
    
     int number, a;
      Scanner sc = new Scanner(System.in);
      System.out.println("For the form a*x mod n = 1");
      System.out.println("Enter N ::");
      number = sc.nextInt();
      System.out.println("Enter A ::");
      a = sc.nextInt();
      C num = new C(number, a);
  }
}
