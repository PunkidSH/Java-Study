import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.print("이름과 전화번호 입력 >> ");
    String name = sc.next();
    String tel = sc.next();
    Phone phone = new Phone(name, tel);

    System.out.print("이름과 전화번호 입력 >> ");
    name = sc.next();
    tel = sc.next();
    Phone phone2 = new Phone(name, tel);
    System.out.println(phone.getName() + "의 번호 " + phone.getTel());
    System.out.println(phone2.getName() + "의 번호 " + phone2.getTel());

  }
}
