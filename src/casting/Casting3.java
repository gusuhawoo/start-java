package casting;

public class Casting3 {
  public static void main(String[] args) {
    long maxIntValue = 2147483647; // int 최고값
    long maxIntOver = 2147483648L; // 최고치 초과로 L추가 (int 최고값 + 1초과)
    int intValue = 0;

    intValue = (int) maxIntValue; //형변환
    System.out.println("maxIntValue casting = " + intValue); // maxIntValue casting = 2147483647

    intValue = (int) maxIntOver;
    System.out.println("maxIntOver casting = " + intValue); // maxIntOver casting = -2147483648
//    int의 제일 작은 숫자로 돌아가서 출력됨 → Overflow
  }
}
