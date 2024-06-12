import java.util.Scanner;

public class Revolver {
  public static void main(String[] args) {

    Gun gun = new Gun();
    Ammo ammo = new Ammo();

    gun.maxAmmo = 6;
    gun.loadedAmmo = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("탄약 확인 : q\n장전 : r\n발사 : e\n");
    while (true) {
      System.out.print("행동을 입력해 주세요. >> ");
        String action = sc.nextLine();
        if (action.equals("q")) {
          gun.checkAmmo();
        }
        else if (action.equals("r")) {
          gun.reloading();
        }
        else if (action.equals("e")) {
          if (gun.loadedAmmo > 0) {
            gun.pullTrigger();
          }
          else if (gun.loadedAmmo == 0) {
            System.out.println("-----------------------");
            System.out.println("장전된 탄약이 없습니다. 탄약 확인 : q 재장전 : r");
            System.out.println("-----------------------");
          }
        }
      }
    }
  }

