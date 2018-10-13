package stuff;
import java.util.Scanner;

public class IO { //Using this we don't have to print or read in the code.


    Scanner input = new Scanner(System.in);

    public int readInt(){
        int number = input.nextInt();
        input.nextLine();
        return number;
    }

    public double readDouble(){
        double number = input.nextDouble();
        input.nextLine();
        return number;
    }

    public String readString(){
        String word = input.nextLine();
        return word;
    }

    public String bakisCheck(){
        System.out.println("Are you bakis, m'lord?");
        String answer = input.nextLine();
        return answer;
    }

    public double bassCheck(){
        System.out.println("How much did the beer cost you?");
        double answer = input.nextDouble();
        return answer;
    }

    public void printSomething(String thing){

        System.out.println(thing);
    }

}
