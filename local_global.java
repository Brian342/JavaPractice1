public class local_global {
    public static void main(String[] args) {
        /*  local = declaring inside a method
                     visible only to that method
            global = declaring outside a method, but within a class 
                      visible to all parts of a class
        */

        @SuppressWarnings("unused")
        DiceRoller diceRoller = new DiceRoller() ; // creating an object from the class Dice
    }
}
