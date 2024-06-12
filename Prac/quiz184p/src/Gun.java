public class Gun {

  int maxAmmo;
  int loadedAmmo;

  public Gun() {
    this.maxAmmo = maxAmmo;
    this.loadedAmmo = loadedAmmo;
  }

  public void checkAmmo() {
    System.out.println("-----------------------");
    System.out.println("탄약의 갯수를 확인합니다.");
    System.out.println("남은 탄약 갯수 : " + loadedAmmo + "\n최대 탄약 갯수 : " + maxAmmo);
    System.out.println("-----------------------");
  }

  public void reloading() {
    System.out.println("-----------------------");
    System.out.println("총을 장전합니다.");
    loadedAmmo = maxAmmo;
    System.out.println("남은 탄약 갯수 : " + loadedAmmo + "\n최대 탄약 갯수 : " + maxAmmo);
    System.out.println("-----------------------");
  }

  public void pullTrigger() {
    System.out.println("-----------------------");
    System.out.println("방아쇠를 당깁니다, 총알이 발사되었습니다.");
    loadedAmmo--;
    System.out.println("-----------------------");
  }
}
