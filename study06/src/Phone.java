public class Phone {
  private String name;
  private String tel;
  
//  생성자, 매개변수 2개 받음
  public Phone(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }
  public String getName() {
    return name;
  }
  public String getTel() {
    return tel;
  }
}
