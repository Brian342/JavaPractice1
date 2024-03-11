import java.util.Random;

public class DiceRoller {

    Random random;
    int number;
    @SuppressWarnings("unused")
    DiceRoller(){
   @SuppressWarnings("unused")
Random random = new Random();// Create a Random object to generate random
   int number = 0;
   roll();
    }
    void roll(){
    number = random.nextInt(6) + 1; // Roll the dice, generating a random integer between 
    System.out.println(number);     // 1 and 6 
    }
}
