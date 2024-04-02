public class CopyObjects {
     public static void main(String args[]){
        CarEncap car1 = new CarEncap("Jeep", "cherokee", 2019);
        //CarEncap car2 = new CarEncap("Bmw", "SUV", 2019);
        //car2.copy(car1);
        CarEncap car2 = new CarEncap(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());



     }
}
