package method;

public class MethodReturn2 {
  public static void main(String[] args) {
    checkAge(10);
    checkAge(20);
  }

  public static void checkAge(int age) {
    if (age < 18) {
      System.out.println(age + ", Minors are not allowed to enter");
      return;
    }
    System.out.println(age + ", Please enter");
  }
}
