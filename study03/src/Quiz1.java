import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
//        126p
//        quiz2
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("정수 10개 입력>>");
//
//        int[] arrNumber = new int[10];
//
//        for (int i = 0; i < arrNumber.length; i++) {
//            System.out.println((i + 1) + "번째 입력 >>");
//            arrNumber[i] = sc.nextInt();
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < arrNumber.length; i++) {
//            if (arrNumber[i] % 3 == 0) {
//                System.out.println("3의 배수 : " + arrNumber[i]);
//            }
//        }
//        quiz4
//        Scanner sc1 = new Scanner(System.in);
//        char[] day = new char[] {'일', '월', '화', '수', '목', '금', '토'};
//
//        while (true) {
//            System.out.println("정수를 입력하세요>>");
//            int input = 0;
//
//            try {
//                input = sc1.nextInt();
//            }
//            catch (Exception e) {
//                System.out.println("경고! 숫자를 입력하세요.");
//                sc1.next();
//                continue;
//            }
//
//            int index = input % 7;
//            System.out.println(day[index]);
//        }



//        quiz6
        String[] eng = {"student", "love", "java", "happy", "future"};
        String[] kor = {"학생", "사랑", "자바", "행복한", "미래"};

        Scanner sc2 = new Scanner(System.in);
        String inputString;

        while (true){
            System.out.print("영어 단어를 입력하세요>>");
            inputString = sc2.nextLine();
            if (inputString.equals(eng[0])) {
                System.out.println(kor[0]);
            }
            else if (inputString.equals(eng[1])) {
                System.out.println(kor[1]);
            }
            else if (inputString.equals(eng[2])) {
                System.out.println(kor[2]);
            }
            else if (inputString.equals(eng[3])) {
                System.out.println(kor[3]);
            }
            else if (inputString.equals(eng[4])) {
                System.out.println(kor[4]);
            }
            else if (inputString.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }
        }
//        quiz8
    }
}
