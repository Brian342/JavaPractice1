public class constructors {
    public static void main(String[] args) {
        //constructor = special method that is called when an object is instantiated (created)
        @SuppressWarnings("unused")
        Human human = new Human("Rick",65,70);
        Human human1 = new Human("Morty",15,50);

        human1.eat();
        human.drink();


    }
}
