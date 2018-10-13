package HeadFirst;



public class Cat extends Dog {

    private int height;


    public Cat(int weight, String name, int age, int height) {
        super(weight, name, age);

        this.height = height;

    }

    public String getHeight() {
        return height + " cm";
    }

    public void setHight(int height) {
        this.height = height;
    }


    public void mjau(){
        System.out.println("Mjau Mjau");
    }

}
