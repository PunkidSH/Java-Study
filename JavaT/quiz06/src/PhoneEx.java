import java.util.Scanner;

public class PhoneEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("이름과 전화번호 입력 >> ");
    String tel = sc.next();
    String name = sc.next();
    Phone p1 = new Phone(tel, name);
    System.out.print("이름과 전화번호 입력 >> ");
    tel = sc.next();
    name = sc.next();
    Phone p2 = new Phone(tel, name);

    System.out.println(p1.getName() + "의 번호 " + p1.getTel());
    System.out.println(p2.getName() + "의 번호 " + p2.getTel());
  }
}
