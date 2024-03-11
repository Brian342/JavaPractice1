public class Friend {
    String name;
    static int numberOfFriends; // static variable shared by all instances of the class

    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have "+numberOfFriends+" friends");
    }
}
