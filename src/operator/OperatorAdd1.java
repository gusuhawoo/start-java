package operator;

public class OperatorAdd1 {
  public static void main(String[] args) {
    int a = 0;

    a = a + 1;
    System.out.println("a = " + a); //1

    a = a + 1;
    System.out.println("a = " + a); //2

    //증감 연산자
    ++a; // a = a + 1
    System.out.println("a = " + a); //3

    ++a;
    System.out.println("a = " + a); //4
  }
}

/*
* 전위, 후위 증감연산자
* ++a : 증감 연산자를 피연산자 앞에 두면 전위(Prefix)증감연산자라 한다(값을 먼저 증가시킨 후 변수를 사용함)
* a++ : 증감 연산자를 피연산자 뒤에 두면 후위(Postfix)증감연산자라 한다(변수를 먼저 사용 후 값을 증가시킴)
*/