package operator;

public class OperatorEx3 {
  public static void main(String[] args) {
    // int형 변수 score를 선언하고 score가 80점 이상이고, 100점 이하이면 true를 출력하고, 아니면 false를 출력한다.
    int score = 80;
    boolean result = score >= 80 && score <= 100;
    System.out.println(result);//true
  }
}
/*
* 자주 사용하는 연산자
* 산술연산자 : +, -, *, /, %
* 증/감연산자 : ++, --
* 비교연산자 : ==, !=, >, <, >=, <=
* 논리연산자 : &&, ||, !
* 대입연산자 : =, +=, -=, *=, /=, %=
* 삼항연산자 : ?:
* instanceof 연산자 : 객체 타입을 확인한다.
* 그 외 nex, [](배열 인덱스), .(객체 멤버 접근), ()(메소드 호출)
*
* 잘 사용하지 않는 연산자
* 비트 연산자 : &, |, ^, ~, <<, >>, >>>
*/