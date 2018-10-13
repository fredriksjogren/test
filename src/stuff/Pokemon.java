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

    public String throwAPokeballAt(String name){
        Random rnd = new Random();
        int catchRate = rnd.nextInt(2)+1;
        if(catchRate == 1){
            return "You got " + name + "........ or did you...";
        }else if(catchRate == 2){
            return "You failed";
        }
        return "";
    }
}
