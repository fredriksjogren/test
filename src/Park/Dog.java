package Park;

public class Dog {

    private int weight;
    private String name;
    private int age;


    public Dog (int weight, String name, int age){

        this.weight = weight;
        this.name = name;
        this.age = age;
    }


    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public void bark(){
        System.out.println("Voff! Voff! Voff!");
    }


    public void setName(String name) {
        this.name = name;
    }


    public void walk(int distance){

        this.weight = weight - 1;
    }


    public String toString() {

        String print ="Name: "+ getName()+" Age: " + getAge()+" years"+ " Weight: " + getWeight()+" kg";

        return print;
    }



}
