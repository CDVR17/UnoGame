import java.util.*;

public class UnoDeck
{
    private ArrayList<UnoCard> deck = new ArrayList<>(108);
    private final String[] colors = {"Red", "Blue", "Yellow", "Green"};
    private final String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private final String[] action = {"+2", "REVERSE", "SKIP"};
    private final String[] wild = {"WILD", "WILD +4"};

    public UnoDeck()
    {
        for(int i = 0; i < 4; i++)
        {
            deck.add(new UnoCard(colors[i], "0"));
        }

        for(int j = 0; j < colors.length; j++)
        {
            for(int a = 0; a < action.length; a++)
            {
                deck.add(new UnoCard(colors[j], action[a]));
                deck.add(new UnoCard(colors[j], action[a]));
            }
        }

        for(int k = 0; k < 4; k++)
        {
            for(int w = 0; w < wild.length; w++)
            {
                deck.add(new UnoCard(wild[w]));
            }
        }

        for(int l = 0; l < colors.length; l++)
        {
            for(int n = 0; n < numbers.length; n++)
            {
                deck.add(new UnoCard(colors[l], numbers[n]));
                deck.add(new UnoCard(colors[l], numbers[n]));
            }
        }
        Collections.shuffle(deck);
    }

    public void reshuffle(ArrayList<UnoCard> discard)
    {
        deck.addAll(discard);
        Collections.shuffle(deck);
    }

    public UnoCard draw()
    {
        return deck.removeFirst();
    }

    public int getSize()
    {
        return deck.size();
    }

    public String toString()
    {
        String result = "";
        for(UnoCard card : deck)
        {
            result += card.toString() + "\n";
        }
        return result;
    }
}
