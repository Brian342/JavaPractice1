import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptions {
    public static void main(String[] args) {
        /*exceptions = an event that occurs during the excecution of a program that,
         *              disrupts the normal flow of instructions.
        */
        Scanner cin = new Scanner(System.in);
    try{
        
        System.out.println("Enter a whole number to divide: ");
        int x = cin.nextInt();
    
        System.out.println("Enter a whole number to divide by: ");
        int y = cin.nextInt();

        int z = x/y;
        System.out.println("result: " +z);
    }
    catch(ArithmeticException e){
        System.out.println("you can't divide by zero! you FOOL!!");
    }
    catch(InputMismatchException e){
        System.out.println("Please enter a number OMG!!");
    }
    catch(Exception e){
            System.out.println("Something went wrong" + e);
    }
    finally {
        cin.close();
    }
    }
    
}
