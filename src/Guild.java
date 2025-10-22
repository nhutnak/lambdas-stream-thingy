import java.util.List;

public class Guild implements Comparable
{
    private String name;
    private List<Adventurer> adventurers;
    public Guild(String name, List<Adventurer> adventurers)
    {
        this.name = name;
        this.adventurers = adventurers;
    }
    public String getName()
    {
        return name;
    }
    public List<Adventurer> getAdventurers()
    {
        return adventurers;
    }

    @Override
    public int compareTo(Object o)
    {
        int c;
        Guild g = (Guild) o;
        if(this.adventurers.size() < g.getAdventurers().size())
        {
            c = -1;
        }
        else if(this.adventurers.size() > g.getAdventurers().size())
        {
            c = 1;
        }
        else
        {
            c = 0;
        }
        return c;
    }

}
