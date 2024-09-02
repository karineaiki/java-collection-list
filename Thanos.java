import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // Nouvelle ArrayList
        ArrayList<Hero> heroes = new ArrayList<>();
        
        // Nouvelles instanciations
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero ("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero ("Doctor Strange", 42);

        //Ajout des héros dans la liste
        heroes.add(blackWidow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        // Changer l'âge de Thor
        for(int i = 0; i < heroes.size(); i++) {
            Hero hero = heroes.get(i);
            if (hero.getName().equals("Thor")) {
                hero.setAge(1501);
                heroes.set(i, hero);
                break;
            }
        }

        System.out.println(heroes);

        // Utiliser shuffle
        Collections.shuffle(heroes);

        System.out.println(heroes);

        // Utiliser subList pour ne retourner que la moitié de la liste
        List<Hero> halfHeroes = heroes.subList(1, 4);

        System.out.println(halfHeroes);

        //Récupérer les noms des héros
        for(int i=0; i< halfHeroes.size(); i++) {
            Hero hero = halfHeroes.get(i);
            System.out.println(hero.getName());
        }
    }
}
