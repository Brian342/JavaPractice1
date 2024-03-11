public class passObjectsAsarguments_to_methods {
    
    public static void main(String[] args) {
        Garage garage = new Garage();

        Cars car = new Cars("Jeep");
        Cars car2 = new Cars("Tesla");

        garage.park(car); // Park the car in the garage
        garage.park(car2);
    }
}
