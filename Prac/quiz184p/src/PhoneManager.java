import java.util.Scanner;

public class PhoneManager {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("인원수>> ");
    int count = sc.nextInt();
    Phone2[] phone = new Phone2[count];

    for (int i = 0; i < count; i++) {
      System.out.print("이름과 전화번호(번호는 연속적으로 입력)>> ");
      String name = sc.next();
      String tel = sc.next();
      phone[i] = new Phone2(name, tel);

      if (i + 1 == count) {
        System.out.println("저장되었습니다...");
      }
    }

    while (true) {
      System.out.print("검색할 이름 >> ");
      String search = sc.next();

      if (search.equals("exit")) {
        System.out.println("프로그램을 종료합니다...");
        break;
      }
      else {
        Phone2 having = null;

        for (int i = 0; i < count; i++) {
          if (phone[i].getName().equals(search)) {
            having = phone[i];
            break;
          }
          else {
            having = null;
         }
        }

       if (having != null) {
         System.out.println(having.getName() + "의 번호는 " + having.getTel() + "입니다.");
       }
       else {
          System.out.println(search + "이/가 없습니다.");
       }
      }



//      for (int i = 0; i < phone.length; i++) {
//        if (search.equals(phone[i].getName())) {
//          System.out.println(phone[i].getName() + "의 번호는 " + phone[i].getTel() + "입니다.");
//          break;
//        }
//      }
    }
  }
}


//while (true) {
//  System.out.print("검색할 이름>>");
//  String findName = sc.next();
//
//  if(findName.equals("exit")) {
//    System.out.println("프로그램을 종료합니다.");
//    break;
//  }
//  else{
//    Phone2 having = null;
//  }
//
//  for (Phone2 phone2 : phone2s) {
//    if (phone2.compareName(findName)) {
//      having = phone2;
//      break;
//    }
//    else {
//      having = null;
//    }
//  }
//
//  if (having != null) {
//    System.out.println(having.getTel(findName));
//  }
//  else {
//    System.out.println(findName + "이 없습니다.");
//  }
//}
