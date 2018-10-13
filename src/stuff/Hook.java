package stuff;

public class Hook {


    private String name;
    private double hours;
    private double price;
    private String std;


    public Hook(String name, double hours, double price, String std) {

        this.name = name;
        this.hours = hours;
        this.price = price;
        this.std = std;


    }

    public String getName() {
        return name;
    }

    public double getHours() {
        return hours;
    }

    public double getPrice() {
        return price;
    }

    public String getStd() {//test
        return std;
    }
}