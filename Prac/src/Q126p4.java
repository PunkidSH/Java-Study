import java.util.Scanner;

public class Q126p4 {
    public static void main(String[] args) {
        char[] arr1 = { '일', '월', '화', '수', '목', '금', '토'};
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("정수를 입력하세요 : ");
            int n = 0;

            try {
                n = sc.nextInt();
            }
            catch (Exception e) {
                System.out.println("경고! 수를 입력하지 않았습니다.");
                sc.next();
                continue;
            }

            if (n < 0) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            int index = n % 7;
            System.out.println(arr1[index]);
        }
    }
}
