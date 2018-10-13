package stuff;

public class beer {

    public final double BURK_STORLEK = 0.33;  // These are gonna be updated lated on
    public final double EN_STOR_STARK = 0.50;
    public final double ÖL_KANNA = 2.62;
    private String typeOfBeer;
    private double price;


    public beer(String typeOfBeer, double price){
        this.typeOfBeer = typeOfBeer;
        this.price = price;


    }


        // Will add some cool methods later on boys

    public double getBURK_STORLEK() {
        return BURK_STORLEK;
    }

    public double getEN_STOR_STARK() {
        return EN_STOR_STARK;
    }

    public double getÖL_KANNA() {
        return ÖL_KANNA;
    }

    public String getTypeOfBeer() {
        return typeOfBeer;
    }

    public void setTypeOfBeer(String typeOfBeer) {
        this.typeOfBeer = typeOfBeer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
