public class toString {
    /*toString = special method that all objects inherit,
     *          that return a String that  "Textually represents" an object.
     *          can be used both implicitly and explicitly
     */
public static void main(String[] args) {
    Car car = new Car();
     
         System.out.printf(car.toString()); //toString method in explicitly
         System.out.println(car); //implecitly
}

}
