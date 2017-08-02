/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 7/31/17
 */
public class Card {

    public final static char SPADE = '\u2660';

    public final static char CLUB = '\u2663';

    public final static char DIAMOND = '\u2666';

    public final static char HEART = '\u2665';

    public int rank;

    public int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        if (rank > 0 && rank < 14 && suit >= 0 && suit < 4) {
            String s;
            switch (rank) {
                case 1:
                    s = "A";
                    break;
                case 11:
                    s = "J";
                    break;
                case 12:
                    s = "Q";
                    break;
                case 13:
                    s = "K";
                    break;
                default:
                    s = "" + rank;
                    break;
            }

            char c;
            switch (suit) {
                case 0:
                    c = SPADE;
                    break;
                case 1:
                    c = CLUB;
                    break;
                case 2:
                    c = DIAMOND;
                    break;
                case 3:
                    c = HEART;
                    break;
                default:
                    c = ' ';
                    break;
            }

            return s + c;
        } else {
            return "INVALID_CARD";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Card(8, 2));
    }
}
