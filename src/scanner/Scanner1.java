package scanner;

import java.util.Scanner;

public class Scanner1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("hello\n"); // print("\n") = printIn()
    System.out.print("world\n");

    System.out.print("Please enter a string.: ");
    String str = scanner.nextLine();
    System.out.println("The string you entered : " + str);
    /*
    Please enter a string: hello
The string you entered : hello
    */

    System.out.print("Please enter an integer.: ");
    int intValue = scanner.nextInt();
    System.out.println("The integer entered : " + intValue);
    /*
    Please enter an integer: 100
    The integer entered : 100
    */

    System.out.print("Please enter a real number.: ");
    double doubleValue = scanner.nextDouble();
    System.out.println("The real number you entered : " + doubleValue);
    /*
    Please enter a real number.: 123.456
    The real number you entered : 123.456
    */
  }
}
