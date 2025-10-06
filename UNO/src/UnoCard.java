public class UnoCard
{
    private String color;
    private String symbol;

    public UnoCard(String color, String symbol)
    {
        this.color = color;
        this.symbol = symbol;
    }

    public UnoCard(String symbol)
    {
        this.symbol = symbol;
    }

    public boolean isAction()
    {
        boolean special = false;
        if(symbol.equals("+2") || symbol.equals("REVERSE") || symbol.equals("SKIP"))
        {
            special = true;
        }
        return special;
    }

    public boolean isWild()
    {
        boolean wild = false;
        if(symbol.equals("WILD") || symbol.equals("WILD +4"))
        {
            wild = true;
        }
        return wild;
    }

    public String getColor()
    {
        return color;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public String toString()
    {
        String result = "";

        if(!isWild())
        {
            result = color + " " + symbol;
        } else {
            result = symbol;
        }

        return result;
    }
}
