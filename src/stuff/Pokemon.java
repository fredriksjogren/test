package stuff;

import java.util.Random;

public class Pokemon {
    private String name;
    private String element;
    private int hp;

    public static final int STARTER_HEALTH = 50;

    public Pokemon(String name, String element){
        this.name = name;
        this.element = element;
        hp = STARTER_HEALTH;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getElement() {
        return element;
    }
    public void setElement(String element) {
        this.element = element;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }


    public Pokemon throwAPokeballAt(Pokemon somePokemon){
        Random rnd = new Random();
        int catchRate = rnd.nextInt(100)+1;
        if(catchRate > 40){
            System.out.println(somePokemon + " was caught! :D");
            return somePokemon;
        }else{
            System.out.println(somePokemon + " got away...");
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
