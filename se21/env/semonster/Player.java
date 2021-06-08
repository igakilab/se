
import java.util.ArrayList;

/**
 * プレイヤーは勝敗数とデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  int win;
  int lose;
  int draw;
  ArrayList<Monster> deck = new ArrayList<>();

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      this.deck.add(new Monster());
    }
  }

  public void showDeck() {
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

  public void clearDeck() {
    this.deck.clear();
  }

}
