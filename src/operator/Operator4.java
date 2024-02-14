package operator;

public class Operator4 {
  public static void main(String[] args) {
    int sum1 = 2 * 2 + 3 * 3; //(2 * 2) + (3 * 3)
    int sum2 =(2 * 2) + (3 * 3); // sum1 = sum2
    System.out.println("sum1 = " + sum1);//13
    System.out.println("sum2 = " + sum2);//13
  }
}

/*
  연산자 우선순위(괄호가 우선순위가 제일 높음)
    1 괄호 ()
    2 단항 연산자 ++, --, !, ~, new, (type)
    3 산술 연산자 *, /, %
    4 Shift 연산자 <<, >>, >>>
    5 비교 연산자 <, <=, >, >=, instanceof
    6 등식 연산자 ==, !=
    7 비트 연산자 &, ^, |
    8 논리 연산자 &&, ||
    9 삼항 연산자 ?:
    10 대입 연산자 =, +=, -=, *=, /=, %= 등등
*/