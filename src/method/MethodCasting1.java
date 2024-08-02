package method;

public class MethodCasting1 {
  public static void main(String[] args) {
    double number = 1.5;
//    printNumber(number);
    printNumber((int) number); // number: 1 명시적 형변환을 사용하여 double을 int형으로 변환
  }

  public static void printNumber(int n) {
    System.out.println("number: " + n);
  }
}
