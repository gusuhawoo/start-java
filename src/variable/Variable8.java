package variable;

public class Variable8 {
  public static void main(String[] args) {
    //정수
    byte b = 127; //-128 ~ 127
    short s = 32767; //-32,768 ~ 32,767
    int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647

    //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
    long l = 9223372036854775807L; //long를 사용할 경우 L을 붙여줘야함

    //실수
    float f = 10.0f; //float를 사용할 경우 f를 붙여줘야함
    double d = 10.0; //실수 리터럴의 기본은 double형을 사용
  }
}

/*
실무에서 자주 사용하는 타입
  int : 정수
  double : 실수
  boolean : true, false
  String : 문자열

실무에서 거의 사용하지 않는 타입
  byte : 표현길이가 너무 작기때문에 기본적으로 int를 사용함
  short : 표현 길이가 너무 작기때문에 기본적으로 int를 사용함
  float : 표현 길이와 정밀도가 낮기때문에 기본적으로 double를 사용함
  char : 문자 하나를 사용하는 일은 거의 없기때문에 기본적으로 String를 사용함

변수 명명 규칙
  * 규칙
  변수 이름은 숫자로 시작할 수 없다(변수 이름에 숫자를 포함하는 것은 가능)
  이름에는 공백이 들어갈 수 없다
  자바의 예약어를 변수 이름으로 사용할 수 없다
  변수 이름은 영문자(a-z,A-Z),숫자(0-9),달러 기호($),밑줄(_)만 사용할 수 있다.

  * 관례
  소문자로 시작하는 camel case를 사용한다(orderDetail,myAccount)
*/