package stuff;

public class BakisChecker {

    public void areYouBakis(String answer){
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("My condolences, you are bakis");
        }else {
            System.out.println("You lucky bastard");
        }
    }
}
