import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List guilds = getData();


    }
    public static List<Adventurer> sortBySkill(Skill skill, List<Guild> guilds)
    {
        return guilds.stream()
                    .flatMap(g -> g.getAdventurers().stream())
                    .filter(a -> a.getSkills().contains(skill)).toList();

    }
    public static Map<String, List<Adventurer>> groupBySkill(List<Guild> guilds)
    {
        return guilds.stream()
                    .flatMap(g -> g.getAdventurers().stream())
                    .collect(Collectors.groupingBy(Adventurer::getRole));
    }
    public static Adventurer mostSkills(List<Guild> guilds)
    {
        return guilds.stream()
                .flatMap(g -> g.getAdventurers().stream())
                .max(Comparator.comparingInt(a -> a.getSkills().size()))
                .get();
    }


    public static List getData()
    {
        List<Guild> guildList = new ArrayList<>();
        ArrayList<Adventurer> g1 = new ArrayList<>();
        g1.add(new Adventurer("Arin", 25, "Warrior", 1500.0, Arrays.asList(Skill.SWORDSMANSHIP, Skill.HEALING)));
        g1.add(new Adventurer("Bella", 22, "Archer", 1200.0, Arrays.asList(Skill.ARCHERY, Skill.STEALTH)));
        g1.add(new Adventurer("Cato", 30, "Rogue", 1800.0, Arrays.asList(Skill.THIEVERY, Skill.STEALTH)));
        g1.add(new Adventurer("Dara", 28, "Mage", 2000.0, Arrays.asList(Skill.NECROMANCY, Skill.RUNECRAFTING)));
        Guild guild = new Guild("DragonSlayers", g1);
        ArrayList<Adventurer> g2 = new ArrayList<>();
        g2.add(new Adventurer("Eli", 35, "Blacksmith", 1600.0, Arrays.asList(Skill.BLACKSMITHING, Skill.MEMECRAFTING)));
        g2.add(new Adventurer("Fay", 27, "Healer", 1400.0, Arrays.asList(Skill.HEALING, Skill.SWORDSMANSHIP)));
        g2.add(new Adventurer("Gus", 29, "Ranger", 1700.0, Arrays.asList(Skill.ARCHERY, Skill.HORSEMANSHIP)));
        g2.add(new Adventurer("Hana", 24, "Thief", 1300.0, Arrays.asList(Skill.THIEVERY, Skill.STEALTH)));
        Guild guild2 = new Guild("ShadowHunters", g2);
        guildList.add(guild);
        guildList.add(guild2);
        ArrayList<Adventurer> g3 = new ArrayList<>();
        g3.add(new Adventurer("Ian", 31, "Warrior", 1900.0, Arrays.asList(Skill.SWORDSMANSHIP, Skill.HORSEMANSHIP)));
        g3.add(new Adventurer("Jade", 26, "Mage", 2100.0, Arrays.asList(Skill.NECROMANCY, Skill.RUNECRAFTING)));
        g3.add(new Adventurer("Kane", 33, "Rogue", 1750.0, Arrays.asList(Skill.THIEVERY, Skill.STEALTH)));
        g3.add(new Adventurer("Lia", 23, "Archer", 1550.0, Arrays.asList(Skill.ARCHERY, Skill.HORSEMANSHIP)));
        Guild guild3 = new Guild("NightRaiders", g3);
        guildList.add(guild3);
        return guildList;
    }
}