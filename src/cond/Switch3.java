package cond;

public class Switch3 {
  public static void main(String[] args) {
    int grade = 2;

    int coupon;
    switch (grade) {
      case 1:
        coupon = 1000;
        break;
      case 2:
        /*
        coupon = 2000;
        break;
        */
        //case 2: 에 값을 넣지않으면 곧바로 case 3의 값으로 넘어간다
      case 3:
        coupon = 3000;
        break;
      default:
        coupon = 500;
        break;
    }
    System.out.println("발급받은 쿠폰 " + coupon); //발급받은 쿠폰 3000
  }
}