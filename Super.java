public class Super {
    public static void main(String[] args) {
        /*super = keyword refers to the superclass (parent) of an object
         *         very similar to the "this" keyword, but instead of referring  
         *         to the current class it refers to the parent class. 
         */

         Hero hero1 = new Hero("Batman", 34, "Money");
         Hero hero2 = new Hero("Superman", 30, "Alot");

         System.out.println(hero1.name);
         // Output: Batman
         System.out.println(hero1.age);
         // Output: 34
         System.out.println(hero1.power);
         //  Output: Money

         System.out.println(hero2.toString());

    }
}
