package operator;

public class Operator1 {
  public static void main(String[] args) {
    int a = 5;
    int b = 2;

    // 덧셈
    int sum = a + b;
    System.out.println("a + b = " + sum);

    // 뺄셈
    int diff = a - b;
    System.out.println("a - b = " + diff);

    // 곱셈
    int multi = a * b;
    System.out.println("a * b = " + multi);

    // 나눗셈
    int div = a / b; //int형은 소숫점 출력을 할 수 없다
    System.out.println("a / b = " + div); // 출력 : 2

    // 나머지
    int mod = a % b; // 5나누기2의 몫은 2,나머지는 1
    System.out.println("a % b = " + mod); // 출력 : 1(나머지값)

    // int z = 10 / 0; //숫자는 0으로 나눌 수 없다
    // System.out.println(z); // 출력 : Exception in thread "main" java.lang.ArithmeticException: / by zero
  }
}
