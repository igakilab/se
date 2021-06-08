public class Main {
  public static void main(String[] args) {
    System.out.println("Hello Monster");
    MonsterFighter mf = new MonsterFighter("user", "cpu");
    mf.draw("user");
    mf.draw("cpu");
    System.out.println("Turn End");
  }
}
