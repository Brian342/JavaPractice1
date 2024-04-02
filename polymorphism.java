public class polymorphism {
    public static void main(String[] args) {
        /*polymorphism = greek word for poly-"many",morph-"form"
         *               the ability of an object to identify as more than one type
         */

         carpoly car = new carpoly();
         Bicyclepoly bicycle = new Bicyclepoly();
         Boatpoly boat = new Boatpoly();

         Vehiclepoly[] racers = {car,bicycle,boat};

         for(Vehiclepoly x : racers){
            x.go(); 
         }

    }
}
