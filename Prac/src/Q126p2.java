import java.util.Scanner;

public class Q126p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 10개 입력 >> ");

        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i + 1 + "번째 정수 : ");
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 3 == 0) {
                System.out.println(arr1[i]);
            }
        }
    }
}
