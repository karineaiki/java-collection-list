import java.util.ArrayList;
import java.util.Comparator;

public class Hero implements Comparable<Hero> {

    // attributes
    private String name;
    private int age;

    // constructors
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " : " + age + "yo.";
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Hero hero) {
        return this.name.compareTo(hero.name);
    }
};

