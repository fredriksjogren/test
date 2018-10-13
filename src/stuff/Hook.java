package stuff;

import java.util.ArrayList;

public class Hook {


    private String name;
    private double hours;
    private double pricePerHour;
    private String std;



    public Hook(String name, double hours, double pricePerHour, String std) {

        this.name = name;
        this.hours = hours;
        this.pricePerHour = pricePerHour;
        this.std = std;

    }

    public String getName() {
        return name;
    }

    public double getHours() {
        return hours;
    }

    public double getPrice() {
        if(getName().equalsIgnoreCase("Diamond")){
            pricePerHour = 10000;
        }
        return pricePerHour;
    }

    public String getStd() {
        if(getName().equalsIgnoreCase("candy")){
            std = "I have them all..";
        }else {
            std = "Gonorea";
        }
        return std;
    }
}