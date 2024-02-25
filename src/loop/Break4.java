package loop;

public class Break4 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; ; i ++){
      sum = sum + i;
      if (sum > 10){
        System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
        break;
      }
    }
    //합이 10보다 크면 종료: i=5 sum=15
  }
}
