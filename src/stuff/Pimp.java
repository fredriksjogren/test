package stuff;

public class Pimp {
   private String name;
   private String weapon;
   private double netWorth;
   private int amountOfHookers;

    public Pimp(String name, String weapon,double netWorth, int amountOfHookers ){
        this.name = name;
        this.weapon = weapon;
        this.netWorth = netWorth;
        this.amountOfHookers = amountOfHookers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    public int getAmountOfHookers() {
        return amountOfHookers;
    }

    public void setAmountOfHookers(int amountOfHookers) {
        this.amountOfHookers = amountOfHookers;
    }
}
