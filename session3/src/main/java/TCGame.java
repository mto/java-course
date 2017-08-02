/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 7/31/17
 */
public class TCGame {

    public final CardHand[] hands = new CardHand[4];

    public final Dealer dealer;

    public int round = 1;

    public TCGame() {
        hands[0] = new CardHand("Tí ");
        hands[1] = new CardHand("Sửu");
        hands[2] = new CardHand("Dần");
        hands[3] = new CardHand("Mão");

        dealer = new Dealer();
    }

    public void newRound() {
        reset();
        shuffleTenTimes();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < hands.length; j++) {
                Card c = dealer.dealCard();
                hands[j].addCard(c);
            }
        }

        System.out.println("ROUND " + round + "\n");
        for (int i = 0; i < hands.length; i++) {
            System.out.println(hands[i]);
        }
        System.out.println();

        round++;
    }

    public void shuffleTenTimes() {
        for (int i = 0; i < 10; i++) {
            dealer.shuffle();
        }
    }

    public void reset() {
        for (CardHand h : hands) {
            h.reset();
        }

        dealer.reset();
    }

    public static void main(String[] args) {
        TCGame g = new TCGame();
        for (int i = 0; i < 25; i++) {
            g.newRound();
        }
    }
}
