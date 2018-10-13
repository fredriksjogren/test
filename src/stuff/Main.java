package stuff;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Random;


public class Main {
    ArrayList<Pokemon> pokemonPc = new ArrayList<>();
    ArrayList<Pokemon> wildPokemons = new ArrayList<>();
    HashSet<Pokemon> pokedex = new HashSet<>();

    ArrayList<Hook> hooks = new ArrayList<>();

    public static void main(String[] args) {
        IO io = new IO();
        Main program = new Main();
        program.runPokemonGame();
        

    }


    public static void someShittyMethod(int a, int b) {
        System.out.println(a * b + b);
    }

    //method that takes an integer and prints 5 :)
    public static void thisIsACoolMethod(int a) {
        System.out.println(5);
    }

    public void runPokemonGame() {
        Main main = new Main();

        main.spawnWildPokemons();
        Pokemon wildPokemon = main.aWildPokemonAppears();
        wildPokemon.throwAPokeballAt(wildPokemon);
        if (wildPokemon != null) {
            main.pokemonPc.add(wildPokemon);
        }
    }

    public void spawnWildPokemons() {
        Pokemon pikachu = new Pokemon("Pikachu", "Lightning");
        Pokemon odish = new Pokemon("Oddish", "Grass");
        Pokemon slowpoke = new Pokemon("Slowpoke", "Normal");
        Pokemon koffing = new Pokemon("Koffing", "Poison");
        Pokemon squirtle = new Pokemon("Squirtle", "Water");
        Pokemon billibass = new Pokemon("Billi bäss", "Gott");

        wildPokemons.add(pikachu);
        wildPokemons.add(odish);
        wildPokemons.add(slowpoke);
        wildPokemons.add(koffing);
        wildPokemons.add(squirtle);
        wildPokemons.add(billibass);
    }

    public Pokemon aWildPokemonAppears() {
        Random rnd = new Random();
        int indexPokemonToSpawn = rnd.nextInt(wildPokemons.size());
        Pokemon pokemonToSpawn = wildPokemons.get(indexPokemonToSpawn);
        System.out.println("A wild " + pokemonToSpawn + " appears!!!");
        return pokemonToSpawn;
    }

    public void runCoolProgram() {
        CoolStuff coolBanana = new CoolStuff("Banana");
        CoolStuff coolTable = new CoolStuff("Table");

        coolBanana.doSomethingCool();
        coolTable.doSomethingCool();
    }


    public void runBakisChecker() {

        BakisChecker bakfull = new BakisChecker();
        IO io = new IO();

        String answer = io.bakisCheck();
        bakfull.areYouBakis(answer);
    }

    public void runBilliBass() {
        IO io = new IO();
        IsTheBassBilli billibass = new IsTheBassBilli();

        double price = io.bassCheck();
        billibass.isBassBilli(price);
    }

    public void didYouSleepEnuf() {
        IO io = new IO();
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



}
