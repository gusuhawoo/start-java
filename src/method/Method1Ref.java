package method;

public class Method1Ref {
  public static void main(String[] args) {
    //계산1
    int sum1 = add(5,10);
    System.out.println("결과1 출력 : " + sum1);

    //계산2
    int sum2 = add(15,20);
    System.out.println("결과2 출력 : " + sum2);
  }

  //add 메서드
  public static int add(int a, int b) {
    System.out.println(a + " + " + b + " 연산 수행");
    int sum = a + b;
    return sum;
  }
}
// Parameter(매개변수):중간에서 전달하는 변수 메서드 호출부와 메서드 내부 사이에서 값을 전달하는 역할을 하는 변수

// public static void main(String[] args) {
// }
// 제어자 변환타입 메서드이름(매개변수 목록) {
// }

// [제어자:public static] [반환타입:void] [메서드이름:main][매개변수 목록:String[] args] {
// 메서드 본문
// }

// Modifier제어자: public,static와 같은 부분
// Return Type반환타입:메서드가 실행 된 후 반환하는 데이터의 타입을 지정하며 메서드가 값을 변환하지 않는 경우, 없다는 뜻의 void를 사용해야한다
// Method Name매서드 이름:메서드의 이름으로 메서드를 호출하는데 사용된다
// Parameter매개변수:입력값으로 메서드 내부에서 사용할 수 있는 변수이며 매개변수는 옵션이다.(입력값이 필요없는 메서드는 매개변수를 지정하지 않아도 된다)
// Method Body매서드 본문:중괄호{}사이에 코드를 작성하며, 실제 메서드의 코드가 위치한다.