package stuff;

public class Main {

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

    public static void someShittyMethod(int a, int b){
        System.out.println(a*b+b);
    }

    //method that takes an integer and prints 5 :)
    public static void thisIsACoolMethod(int a){
        System.out.println(5);
    }



}
