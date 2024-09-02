import java.util.Comparator;

public class AgeComparator implements Comparator<Hero> {
    @Override
    public int compare(Hero hero1, Hero hero2) {

        return hero1.getAge() - hero2.getAge();
    }
}
