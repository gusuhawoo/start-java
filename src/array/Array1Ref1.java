package array;

public class Array1Ref1 {
  public static void main(String[] args) {
    int[] students;
    students = new int[5];

    students[0] = 90;
    students[1] = 80;
    students[2] = 70;
    students[3] = 60;
    students[4] = 50;

    System.out.println("학생1 점수 : " + students[0]);
    System.out.println("학생2 점수 : " + students[1]);
    System.out.println("학생3 점수 : " + students[2]);
    System.out.println("학생4 점수 : " + students[3]);
    System.out.println("학생5 점수 : " + students[4]);

//    int student1 = 90;
//    int student2 = 80;
//    int student3 = 70;
//    int student4 = 60;
//    int student5 = 50;

//    System.out.println("학생1 점수 : " + student1);
//    System.out.println("학생2 점수 : " + student2);
//    System.out.println("학생3 점수 : " + student3);
//    System.out.println("학생4 점수 : " + student4);
//    System.out.println("학생5 점수 : " + student5);
  }
}
