/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 7/31/17
 */
public class CardHand {

    public Card[] cards;

    public String name;

    private int count;

    public CardHand(String name) {
        this.name = name;
        this.cards = new Card[3];
    }

    public void addCard(Card c) {
        if (count >= 3) {
            System.out.println("Cannot add more card");
        } else {
            cards[count] = c;
            count++;
        }
    }

    public void reset() {
        for (int i = 0; i < count; i++) {
            cards[i] = null;
        }
        count = 0;
    }

    public int getScore() {
        if (count != 3) {
            throw new IllegalArgumentException("Need to deal 3 cards");
        } else {
            int r = (cards[0].rank + cards[1].rank + cards[2].rank) % 10;
            return r == 0 ? 10 : r;
        }
    }

    @Override
    public String toString() {
        return name + ": " + getScore() + " | " + cards[0] + " " + cards[1] + " " + cards[2];
    }

    public static void main(String[] args){
        CardHand h = new CardHand("Tí");
        h.addCard(new Card(1, 2));
        h.addCard(new Card(6, 3));
        h.addCard(new Card(11, 0));

        System.out.println(h);
    }
}
