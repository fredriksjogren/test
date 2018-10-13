package stuff;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    ArrayList<Pokemon> pokemonPc = new ArrayList<>();
    ArrayList<Pokemon> wildPokemons = new ArrayList<>();
    HashSet<Pokemon> pokedex = new HashSet<>();

    public static void main(String[] args) {

        Main main = new Main();
	    int a = 5;
	    int b = 10;
	    someShittyMethod(a, b);

	    CoolStuff coolBanana = new CoolStuff("Banana");
	    CoolStuff coolTable = new CoolStuff("Table");


        coolBanana.doSomethingCool();
        coolTable.doSomethingCool();

        main.spawnWildPokemons();
	    Pokemon wildPokemon = main.aWildPokemonAppears();
	    wildPokemon.throwAPokeballAt(wildPokemon);
	    if(wildPokemon != null){
	        main.pokemonPc.add(wildPokemon);
        }



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
    public void spawnWildPokemons(){
        Pokemon pikachu = new Pokemon("Pikachu", "Lightning");
        Pokemon odish = new Pokemon("Oddish", "Grass");
        Pokemon slowpoke = new Pokemon("Slowpoke", "Normal");
        Pokemon koffing = new Pokemon("Koffing", "Poison");
        Pokemon squirtle = new Pokemon("Squirtle", "Water");

        wildPokemons.add(pikachu);
        wildPokemons.add(odish);
        wildPokemons.add(slowpoke);
        wildPokemons.add(koffing);
        wildPokemons.add(squirtle);
    }
    public Pokemon aWildPokemonAppears(){
        Random rnd = new Random();
        int indexPokemonToSpawn = rnd.nextInt(wildPokemons.size());
        Pokemon pokemonToSpawn = wildPokemons.get(indexPokemonToSpawn);
        System.out.println("A wild " + pokemonToSpawn + " appears!!!");
        return pokemonToSpawn;
    }

    public static void someShittyMethod(int a, int b) {
        System.out.println(a * b + b);
    }

    //method that takes an integer and prints 5 :)
    public static void thisIsACoolMethod(int a) {
        System.out.println(5);
    }



}
