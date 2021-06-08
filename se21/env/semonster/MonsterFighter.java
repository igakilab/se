
import java.util.HashMap;

/**
 * 準備 1. userとcpuの作成 2. モンスターカードの初期化 3. player Deckの作成
 *
 * ゲーム開始 1. draw, 2.役の判定,3.勝敗判定,4.次のターン
 */
public class MonsterFighter {
  HashMap<String, Player> map = new HashMap<>();

  MonsterFighter(String p1, String p2) {
    this.map.put(p1, new Player());
    this.map.put(p2, new Player());
  }

  void draw(String playerName) {
    System.out.println("Draw:" + playerName);
    Player p = map.get(playerName);
    p.drawMonsters();
    p.showDeck();
  }

}
