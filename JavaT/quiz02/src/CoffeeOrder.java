import java.util.Scanner;

public class CoffeeOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] coffees = {"에스프레소", "아메리카노", "카푸치노", "카페라떼"};
    int[] prices = {2000, 2500, 3000, 3500};

    System.out.print("커피 주문하세요 >> ");

    String order = sc.next();
    int count = sc.nextInt();

    for (int i = 0; i < coffees.length; i++) {
      if (order.equals(coffees[i])) {
        System.out.println((prices[i] * count) + " 원입니다.");
      }
    }
  }
}
