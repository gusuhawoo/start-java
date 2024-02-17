package operator;

public class Assign1 {
  public static void main(String[] args) {
    //대입 연산자
    //+=, -=, *=, /=, %=
    // i = i + 3 → i += 3
    // i = i * 4 → i *= 4
    int a = 5;
    a += 3;//8 (5 + 3): a = a + 3 [a(기존의 5)에 3을 더하고 결과를 =으로 a에 다시 대입]
    System.out.println(a);//8
    a -= 2;//6 (8 - 2): a = a - 2 [a(기존의 8)에 2을 빼고 결과를 =으로 에 다시 대입]
    System.out.println(a);//6
    a *= 4;//24 (6 * 4): a = a * 4 [a(기존의 6)에 4를 곱하고 결과를 =으로 a에 다시 대입]
    System.out.println(a);//24
    a /= 3;//8 (24 / 3): a = a / 3 [a(기존의 24)에 3을 나누고 결과를 =으로 a에 다시 대입]
    System.out.println(a);//8
    a %= 5;//3 (8 % 5): a = a % 5 [a(기존의 8)에 5를 뺀 나머지값을 결과로써 =으로 다시 대입]
    System.out.println(a);//3
  }
}
