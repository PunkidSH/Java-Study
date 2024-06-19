import java.util.Scanner;

public class taja {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {

      System.out.print("입력 >> ");
      String strInput = sc.nextLine();

      strInput = strInput.replace("q", "e");

      System.out.println("출력 >> " + strInput);
    }
  }
}
