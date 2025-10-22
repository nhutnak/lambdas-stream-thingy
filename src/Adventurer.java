import java.util.List;

public class Adventurer implements Comparable
{
    private String name;
    private int age;
    private String role;
    double goldEarned;
    private List<Skill> skills;

    public Adventurer(String name, int age, String role, double goldEarned, List<Skill> skills)
    {
        this.name = name;
        this.age = age;
        this.role = role;
        this.goldEarned = goldEarned;
        this.skills = skills;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getRole()
    {
        return role;
    }

    public double getGoldEarned()
    {
        return goldEarned;
    }

    public List<Skill> getSkills()
    {
        return skills;
    }

    @Override
    public String toString()
    {
        return "Adventurer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", goldEarned=" + goldEarned +
                ", skills=" + skills +
                '}';
    }

    @Override
    public int compareTo(Object o)
    {
        Adventurer a = (Adventurer) o;
        int c;
        if (this.goldEarned < a.goldEarned)
        {
            c = -1;
        }
        else if (this.goldEarned > a.goldEarned)
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
