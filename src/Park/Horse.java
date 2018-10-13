package Park;

public class Horse extends Dog {

    private double jumpHeight;


    public Horse(int weight, String name, int age, double jumpHeight) {
        super(weight, name, age);

        this.jumpHeight = jumpHeight;

    }


    public String getJumpHeight() {
        return jumpHeight +" cm";
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}

