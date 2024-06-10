import java.util.Scanner;

public class quiz {
  public static void main(String[] args) {
    System.out.println("\n-----문제 1 ) -----\n");
//    Song 클래스 타입의 객체 mySong 생성
    Song mySong = new Song("Nessun Dorma");
//    Song 클래스 타입의 객체 yourSong 생성
    Song yourSong = new Song("공주는 잠 못 이루고");
//    객체 mySong의 인스턴스 멤버 중 getTitle() 메소드를 사용
    System.out.println("내 노래는 " + mySong.getTitle());
    System.out.println("너 노래는 " + yourSong.getTitle());



    System.out.println("\n-----문제 2 ) -----\n");

//    Scanner sc = new Scanner(System.in);
//    System.out.print("이름 입력 >> ");
//    String name = sc.nextLine();
//    System.out.print("전화번호 입력 >> ");
//    String tel = sc.nextLine();
//    Phone sponge = new Phone(name, tel);
//
//    System.out.print("이름 입력 >> ");
//    name = sc.nextLine();
//    System.out.print("전화번호 입력 >> ");
//    tel = sc.nextLine();
//    Phone squid = new Phone(name, tel);
//
//    System.out.println(sponge.getName() + "의 번호 " + sponge.getTel());
//    System.out.println(squid.getName() + "의 번호 " + squid.getTel());
//--------------------------------------------------------------------------------------------------
//    Scanner sc = new Scanner(System.in);
////    화면 출력이 먼저, 화면 출력 후 바로 뒤에 입력해야 하기 때문에 print() 사용
//    System.out.print("이름과 전화번호 입력 >> ");
////    키보드 입력 받기
//    String name = sc.next();
//    String tel = sc.next();
//
////    입력받은 내용을 기반으로 Phone 클래스 타입의 객체 생성
//    Phone phone1 = new Phone(name, tel);
//
//    System.out.print("이름과 전화번호 입력 >> ");
////    위에 이미 선언한 변수 재활용
//    name = sc.next();
//    tel = sc.next();
//
////    입력받은 내용을 기반으로 Phone 클래스 타입의 두번째 객체 생성
//    Phone phone2 = new Phone(name, tel);
//
//    System.out.println(phone1.getName() + "의 전화번호 " + phone1.getTel());
//    System.out.println(phone2.getName() + "의 전화번호 " + phone2.getTel());



    System.out.println("\n-----문제 3 ) -----\n");
//
//    Scanner sc = new Scanner(System.in);
////    Rect 클래스 타입의 배열 rext 생성, new Rect[4]를 사용하여 크기가 4인 배열 생성
////    Rect 클래스 타입의 배열을 생성한 것이지 Rect 클래스 타입의 객체를 생성한 것은 아님, 클래스 타입의 배열 요소는 현재 모두 null임
//    Rect[] rect = new Rect[4];
//
//
//    for (int i = 0; i < rect.length; i++) {
//      System.out.print((i + 1) + " 너비와 높이 >> ");
////      nextInt() 를 사용하여 키보드 입력을 정수로 받음
//      int width = sc.nextInt();
//      int height = sc.nextInt();
////      Rect 클래스 타입의 배열의 i번 index에 새로운 Rect 클래스 타입의 객체를 생성하여 저장
//      rect[i] = new Rect(width, height);
//
//      if (i + 1 == rect.length) {
//         System.out.println("저장하였습니다...");
//      }
//    }
//
////    총합을 저장할 변수 선언
//    int total = 0;
//
////    for문을 통해서 Rect 클래스 타입의 배열이 가지고 있는 모든 데이터 출력
//    for (int i = 0; i < rect.length; i++) {
//      total += rect[i].getArea();
//    }
//      System.out.println("사각형의 전체 합은 : " + total);


//    ----------------------------------------------------------------------------------------------------
//    Scanner sc = new Scanner(System.in);
//    System.out.print("1 너비와 높이 >> ");
//    Rect area1 = new Rect(sc.nextInt(), sc.nextInt());
//
//    System.out.print("2 너비와 높이 >> ");
//    Rect area2 = new Rect(sc.nextInt(), sc.nextInt());
//
//    System.out.print("3 너비와 높이 >> ");
//    Rect area3 = new Rect(sc.nextInt(), sc.nextInt());
//
//    System.out.print("4 너비와 높이 >> ");
//    Rect area4 = new Rect(sc.nextInt(), sc.nextInt());
//
//    System.out.println("저장하였습니다...");
//    System.out.println("사각형의 전체 합은 " + (area1.getArea() + area2.getArea() + area3.getArea() + area4.getArea()));



    System.out.println("\n-----문제 4 ) -----\n");

////      키보드 입력을 받기 위한 Scanner 클래스 타입의 객체 선언
//      Scanner sc = new Scanner(System.in);
//
//      System.out.print("인원수 >> ");
////      사용자가 입력한 인원수를 입력받음
//      int count = sc.nextInt();
//
////      사용자가 입력한 인원수 만큼 Phone2 클래스 타입의 객체를 생성해야 하므로 Phone2 클래스 타입의 배열을 선언
//      Phone2[] phone = new Phone2[count];
//
////      배열의 크기만큼 자동으로 사용자 데이터 입력받기
//      for (int i = 0; i < count; i++) {
//        System.out.print("이름과 전화번호(번호는 연속적으로 입력 >> ");
//        String name = sc.next();
//        String tel = sc.next();
//
////        Phone2 클래스 타입의 객체를 4번 생성함 생성하고 배열에 저장함
//        phone[i] = new Phone2(name, tel);
//
//        if ((i + 1) == count) {
//           System.out.println("저장되었습니다..");
////           Scanner를 통해서 키보드 입력을 받았을 경우 입력을 위해서 사용한 메소드의 종류에 따라 '\n'이 메모리에 남아있는 경우가 있음
////          nextLine()을 마지막으로 한번 더 실행하여 버퍼의 내용을 완전히 비움
//           sc.nextLine();
//        }
//      }
//
////      검색할 데이터를 입력받음, 반복문을 사용하여 필요없을 때까지 계속 입력받음
//      while (true) {
////        검색할 데이터 입력받기
//        System.out.print("검색할 이름 >> ");
//        String search = sc.nextLine();
//
//        String output = ""; // 검색 결과 출력용 변수 선언
//
////        단순 if문을 사용하여 입력된 데이터가 'exit'와 같으면 프로그램 종료, 아니면 계속 진행
//        if (search.equals("exit")) {
//          System.out.println("프로그램을 종료합니다.");
//          break;
//        }
//
////        입력받은 검색어를 기준으로 Phone2 클래스 타입의 배열에 저장된 내용을 검색
//        for (int i = 0; i < phone.length; i++) {
////          입력받은 검색어와 동일한 내용이 있을 경우 검색 결과 출력용 변수에 데이터 입력 후 for문 종료
//          if (search.equals((phone[i]).getName())) {
//            output = phone[i].getName(); + "의 전화번호는 " + phone[i].getTel() + "입니다.";
//            break;
//          }
//        }
//
////        출력용 변수에 데이터가 있는지 확인 후 출력
//        if (output.length() > 0 && !output.equals("")) {
//          System.out.println(output);
//        }
//        else {
//          System.out.println(search + " 이 없습니다.");
//        }
//      }

// --------------------------------------------------------------------------------------------------
//    Scanner sc = new Scanner(System.in);

//    System.out.print("인원수 >> ");
//    int count = sc.nextInt();

//    String[] nameArr = new String[count];
//    String[] telArr = new String[count];
//
//    for (int i = 0; i < a; i++) {
//      System.out.print("이름과 전화번호 (번호는 연속적으로 입력)>>");

//      String tel = sc.next();
//      String name = sc.next();
//      Phone2 phone = new Phone2(name, tel);
//
//      nameArr[i] = phone.getName();
//      telArr[i] = phone.getTel();
//    }
//    System.out.println("저장되었습니다...");
//
//    while (true) {
//      if ()
//    }



    System.out.println("\n-----문제 5 ) -----\n");


  }
}

//public class Circle {
//  private int radius;
//  public Circle(int radius) {
//    this.radius = radius;
//  }
//  public int getRadius() {
//    return radius;
//  }
//  public void setRadius(int radius) {
//    this.radius = radius;
//  }
//}
//
//// a와 b의 반지름이 같으면 true 리턴
//public static class CircleManager {
//}
