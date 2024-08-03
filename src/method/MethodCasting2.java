package method;

public class MethodCasting2 {
  public static void main(String[] args) {
    int number = 100;
    printNumber(number); // number: 100.0
//    printNumber((int) number); // number: 1 명시적 형변환을 사용하여 double을 int형으로 변환
  }

  public static void printNumber(double n) {
    System.out.println("number: " + n);
  }
}
