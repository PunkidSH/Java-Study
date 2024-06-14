import java.util.Scanner;

public class q3c126p4 {
  public static void main(String[] args) {
    char[] day = {'일', '월', '화', '수', '목', '금', '토'};
    Scanner sc = new Scanner(System.in);

    while (true) {
      try {
        System.out.print("정수를 입력하세요>>");
        int n = sc.nextInt();
        if (n >= 0) {
          int a = n % 7;
          System.out.println(day[a]);
        }
        else {
          System.out.println("프로그램 종료합니다...");
          break;
        }
      }
      catch (Exception e) {
        System.out.println("경고! 수를 입력하지 않았습니다.");
      }
      finally {
        sc.nextLine();
      }
    }
  }
}
