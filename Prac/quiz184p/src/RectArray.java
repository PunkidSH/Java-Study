import java.util.Scanner;

public class RectArray {
  public static void main(String[] args) {
    Rect[] rect = new Rect[4];

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < rect.length; i++) {
      System.out.print((i + 1) + " 너비와 높이 >> ");
      int width = sc.nextInt();
      int height = sc.nextInt();
      rect[i] = new Rect(width, height);

      if (i + 1 == rect.length) {
        System.out.println("저장하였습니다...");
      }
    }

    int total = 0;

    for (int i = 0; i < rect.length; i++) {
      total = total + rect[i].getArea();
    }

    System.out.println("사각형의 전체 합은 " + total);
  }
}
