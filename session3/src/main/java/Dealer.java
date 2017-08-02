import java.util.Random;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 7/31/17
 */
public class Dealer {

    public final Card[] cards = new Card[52];

    private int dealtIndex = 51;

    public Dealer() {
        int[] idxs = MathUtil.randomPermutation(52);

        for (int i = 0; i < 52; i++) {
            int idx = idxs[i];

            cards[i] = new Card((idx / 4) + 1, idx % 4);
        }
    }

    public void shuffle() {
        int k = new Random().nextInt(52);
        basicShuffle(k);
    }

    private void basicShuffle(int k) {
        Card[] tmp = new Card[cards.length];

        for (int i = 0; i < 52; i++) {
            tmp[i] = cards[i];

            if (i < (52 - k)) {
                cards[i] = cards[i + k];
            } else {
                cards[i] = tmp[i - (52 - k)];
            }
        }
    }

    public void showCards() {
        for (Card c : cards) {
            System.out.print(c + " ");
        }
    }

    public Card dealCard() {
        Card c = cards[dealtIndex];
        dealtIndex--;

        return c;
    }

    public void reset() {
        dealtIndex = 51;
    }

    public static void main(String[] args) {
        Dealer d = new Dealer();
        d.showCards();

        for (int i = 0; i < 10; i++) {
            d.shuffle();
        }

        d.showCards();
    }
}
