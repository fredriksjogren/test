package stuff;

import java.util.ArrayList;

public class Main {

    ArrayList<Hook> hooks = new ArrayList<>();

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        someShittyMethod(a, b);

        Pokemon pikachu = new Pokemon("Pikachu", "Lightning");
        String status = pikachu.throwAPokeballAt("Pikachu");
        System.out.println(status);

        CoolStuff coolBanana = new CoolStuff("Banana");
        CoolStuff coolTable = new CoolStuff("Table");

        coolBanana.doSomethingCool();
        coolTable.doSomethingCool();

        BakisChecker bakfull = new BakisChecker();
        IO io = new IO();

        String answer = io.bakisCheck();
        bakfull.areYouBakis(answer);

        didYouSleepEnuf sleeping = new didYouSleepEnuf();

        //pls keep it to a double
        System.out.println("Enter a number for the amount of hours you slept:");
        double sleep = io.readDouble();
        sleeping.isItEnuf(sleep);
    }


    public void addHooks(Hook someHook){
        hooks.add(someHook);
    }

    public void wantToGetCrazy(){
        String option = null;
        Hook newHook = new Hook("candy",2,0.5,"All of them..");
        System.out.println(newHook.getName());
        System.out.println("Want to get crazy with me?");
        //add io
        if(option.equalsIgnoreCase("yes")){
            System.out.println(newHook.getName()+" and you had a great time for"+newHook.getHours()+"hours");
        }else
            System.out.println("okey... are u poor or just just a tame person...");
    }

    public static void someShittyMethod(int a, int b) {
        System.out.println(a * b + b);
    }

    //method that takes an integer and prints 5 :)
    public static void thisIsACoolMethod(int a) {
        System.out.println(5);
    }


}
