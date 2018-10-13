package stuff;

public class IsTheBassBilli {

    public void isBassBilli(double price){
        if (price <= 20.0){
            System.out.println("Jävlar, den va billi du");
        }else if (price <= 40 && price > 20){
            System.out.println("Billi men den kunde vart billiare");
        }else if (price > 40 && price <= 50){
            System.out.println("På håret att den e billi asså");
        }else {
            System.out.println("You have done goofed, dyr bäss detected");
        }

    }
}
