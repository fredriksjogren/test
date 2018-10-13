package HeadFirst;
import java.util.ArrayList;
import java.util.Scanner;

public class Park {
    Scanner sc = new Scanner(System.in);

    ArrayList<Dog> dogs;
    ArrayList<Cat> cats;
    ArrayList<Horse> horses;

    public Park(){

        this.dogs = new ArrayList<>();
        this.cats = new ArrayList<>();
        this.horses = new ArrayList<>();

    }

    public void addDog(){

        System.out.println("Enter dogs name");
        String name = sc.nextLine();
        System.out.println("Age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Weight");
        int weight = sc.nextInt();
        sc.nextLine();

        Dog newDog = new Dog(weight,name,age);
        dogs.add(newDog);


    }

    public void addCat(){
        System.out.println("Enter cats name");
        String name = sc.nextLine();
        System.out.println("Age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Weight");
        int weight = sc.nextInt();
        sc.nextLine();
        System.out.println("Height");
        int height = sc.nextInt();
        sc.nextLine();
        Cat newCat = new Cat(weight,name,age,height);
        cats.add(newCat);


    }

    public void addHorse(){
        System.out.println("Enter horse name");
        String name = sc.nextLine();
        System.out.println("Age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Weight");
        int weight = sc.nextInt();
        sc.nextLine();
        System.out.println("How high can your horse jump?");
        int jump = sc.nextInt();
        sc.nextLine();
        if(jump> 100){
            System.out.println("Gooood damn your horse is amazing!\n");
        }
            Horse newHorse = new Horse(weight,name,age,jump);
            horses.add(newHorse);
        }




    public void menu(){
        int option;
        do {
            System.out.println("Enter your option.");
            System.out.println("1 - create dog.");
            System.out.println("2 - create cat.");
            System.out.println("3 - create horse.");
            System.out.println("4 - Exit");


            option = sc.nextInt();
            sc.nextLine();

            switch (option) {

                case 1: {

                    addDog();
                    System.out.println(dogs+"\n");
                }break;

                case 2: {

                    addCat();
                    System.out.println(cats+"\n");
                }break;

                case 3: {
                    addHorse();
                    System.out.println(horses+"\n");
                }break;

                case 4: {
                    System.out.println("Bye this is how your park looks like for now.");
                    System.out.println(dogs.toString() + cats.toString() + horses.toString());
                }break;
            }
        }while (option != 4);
    }



}

