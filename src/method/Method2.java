package method;

public class Method2 {
  public static void main(String[] args) {
//    String str = printHeader(); // 매개변수가 없기때문에 반환타입을 받으려고 하면 에러 발생
    printHeader();
    System.out.println("The program is working");
    printFooter();
  }

  public static void printHeader() {
    System.out.println("Start the program");
    return; // 반환타입이 없을경우 return 생략가능
  }

  public static void printFooter() {
    System.out.println("Stop the program");
  }
}
