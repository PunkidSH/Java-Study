import java.util.Scanner;

public class BuildingHeight {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = 5;
    System.out.print("몇 층인지 입력하세요 >> ");
    int floors = sc.nextInt();
    System.out.println((floors * n) + "m 입니다.");
  }
}
