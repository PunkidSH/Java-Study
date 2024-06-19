import java.util.Scanner;

public class ThreeSixNine {
  public static void main(String[] args) {
    String[] eng = {"student", "love", "java", "happy", "future"};
    String[] kor = {"학생", "사랑", "자바", "행복한", "미래"};

    Scanner sc = new Scanner(System.in);

    String check = "";

    while (true) {
      System.out.print("영어 단어를 입력하세요 >> ");
      String search = sc.nextLine();

      if (search.equals("exit")) {
        System.out.println("종료합니다.");
        break;
      }
      else {
        for (int i = 0; i < search.length(); i++) {
          if (search.equals(eng[i])) {
            check = kor[i];
            System.out.println(kor[i]);
            break;
          }
          else {
            check = "";
          }
        }
      }
      if (check == "") {
        System.out.println("그런 영어 단어가 없습니다.");
      }
    }
  }
}
