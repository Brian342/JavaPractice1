import java.util.Scanner;

public class Dynamicpolymorphism {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*polymorphism = many shapes/forms
         * dynamic = after compilation (during runtime)
         * 
         * ex. a corvette is a: corvette, and a car, and a vehicle, and an object
         */

         Scanner cin = new Scanner(System.in);
         AnimalDynamic animal;

         System.out.println("What animal do you want?");
         System.out.println("(1 = dog) or (2=cat): ");

         int choice = cin.nextInt();

         if(choice == 1){
            animal = new DogDynamic();
            animal.speak();
         }
         else if(choice==2){
            animal = new CatDynamic();
            animal.speak();
         }
         else{
            animal = new AnimalDynamic();
            System.out.println("That choice was invalid");
            animal.speak();
         }

    }
}
