import java.util.Scanner;

public class q3c126p2 {
  public static void main(String[] args) {

    System.out.print("정수 10개 입력>>");
    Scanner sc = new Scanner(System.in);

    int[] a = new int[10];

    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 3 == 0 && a[i] != 0) {
        System.out.print(a[i]);
      }
    }
  }
}
