import java.util.Scanner;

public class q3c126p5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int [10];

    System.out.print("정수 10개 입력 >> ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int arrNum = arr[i];
          arr[i] = arr[j];
          arr[j] = arrNum;
        }
      }
      System.out.print(arr[i] + " ");
    }

  }
}