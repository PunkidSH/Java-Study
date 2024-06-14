import java.util.Scanner;

public class q3c125p1 {
    public static void main(String[] args) {

        System.out.print("알파벳 한 문자를 입력하세요>>");
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.next();
        char c = sc.charAt(0);

        for (char i = 'a'; i < c; i++) {
            for (char j = i; j < c; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
