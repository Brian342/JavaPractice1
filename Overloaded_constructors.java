public class Overloaded_constructors {
    /*overloaded constructors = Multiple constructors within a 
                                class with the same name,
     *                          but have different parameters name 
     *                          + parameters = signature
     */
    public static void main(String[] args) {
        Pizza pizza = new Pizza(); //calling constructor with all
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);

    }
}
