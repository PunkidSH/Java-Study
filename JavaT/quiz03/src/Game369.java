import java.util.Scanner;

public class Game369 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    int b;
    int count;

    while (true) {
      System.out.print("1 ~ 99 사이의 정수를 입력하세요 >> ");
      count = 0;
      int n = sc.nextInt();
      a = n / 10;
      b = n % 10;

      if (n == 0) {
        System.out.println("종료합니다");
        break;
      }
      else if (n < 10 && n > 0) {
        if (b % 3 == 0) {
          count++;
        }
      }
      else if (n > 10){
        if (a % 3 == 0) {
          count++;
        }

        if (b % 3 == 0 && b != 0) {
          count++;
        }
      }

      switch (count) {
        case 0:
          System.out.println("박수없음");
          break;

        case 1:
          System.out.println("박수짝");
          break;

        case 2:
          System.out.println("박수짝짝");
          break;
      }
    }
  }
}
