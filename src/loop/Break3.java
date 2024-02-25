package loop;

public class Break3 {
  public static void main(String[] args) {
    int sum = 0;
    int i = 1;

    for (; ; ){ // for (; ; ) → infinite
      sum = sum + i;
      if (sum > 10){
        System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
        break;
      }
      i++;
    }
    //합이 10보다 크면 종료: i=5 sum=15
  }
}
