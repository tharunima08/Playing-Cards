import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
enum Suit{
    Spade,Club,Heart,Diamond
}
enum Rank{
    A,J,Q,K,two,three,four,five,six,seven,eight,nine,ten
}
enum Color{
    Red,Black
}
class Card
{
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit,Rank rank) {
        this.suit=suit;
        this.rank=rank;
    }

    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }
public Color getcolor(){
        if(suit == Suit.Heart || suit == Suit.Diamond){
            return Color.Red;
        }
        else {
            return Color.Black;
        }
}
    @Override
    public String toString() {
        return rank+" of "+suit;
    }
}
class Deck {
    private List<Card> c;
    public Deck() {
        c = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                c.add(new Card(suit, rank));
            }
        }
    }

    public void Shuffle() {
        Collections.shuffle(c);
    }

    public Card DrawCard() {
        if (c.isEmpty()) {
            throw new IllegalStateException("Deck is Empty");
        }
        return c.remove(c.size() - 1);
    }

    public void Sort() {
        Collections.sort(c, new CardCom());
    }

    public int Size() {
        return c.size();
    }

    @Override
    public String toString() {
        return "Deck{" +
                " c= " + c +
                '}';
    }

    public class CardCom implements Comparator<Card>
    {
        @Override
        public int compare(Card c1, Card c2)
        {
            int cc = c1.getcolor().compareTo(c2.getcolor());
            if (cc != 0)
            {
                return cc;
            }
            int sc = c1.getSuit().compareTo(c2.getSuit());
            if (sc != 0)
            {
                return sc;
            }
           return c1.getRank().compareTo(c2.getRank());
        }
    }
}
public class PalyingCards {
    public static void main(String[] args) {
        Deck d= new Deck();
        System.out.println(d);
        System.out.println("Size is "+d.Size());
        d.DrawCard();
        System.out.println("Size is "+d.Size());
        d.Shuffle();
        System.out.println(d);
        System.out.println("Size is "+d.Size());
        Card dc=d.DrawCard();
        System.out.println("Card drawn is "+d.DrawCard());
        
    }
}
