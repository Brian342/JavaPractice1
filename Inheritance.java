public class Inheritance {
    public static void main(String[] args){
    /* inheritance = the process where one class acquires,  
     *                the attributes and methods of another.
     */
    Carr car = new Carr();
    car.go();

    Bicycle bike = new Bicycle();

    bike.stop();

    System.out.println(car.speed);
    System.out.println(bike.speed);

    System.out.println("your car has:"+car.doors+" doors");
    System.out.println("Your bike has:"+bike.pedals+" pedals");

    }
    

}
