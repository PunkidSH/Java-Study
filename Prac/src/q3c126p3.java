import java.util.Scanner;

public class q3c126p3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("정수를 입력하세요>>");

      try {
        int n = sc.nextInt();
        if (n % 2 == 1) {
          System.out.println("홀수");
        }
        else {
          System.out.println("짝수");
        }
      }
      catch (Exception e) {
        System.out.println("수를 입력하지 않아 프로그램 종료합니다.");
        break;
      }
      finally {
        sc.nextLine();
      }
    }
  }
}
