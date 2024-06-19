import java.util.Scanner;

public class park {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("키 입력 >> ");
    int maxWeight = sc.nextInt();
    int n = sc.nextInt();
    int[] arr = new int[n];
    int sumWeight = 0;

    int count = 0;

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      sumWeight += arr[i];
      if (maxWeight >= sumWeight) {
        count++;
      }
      else {
        break;
      }
    }
    System.out.println("탑승 인원 >> " + count);
  }
}
