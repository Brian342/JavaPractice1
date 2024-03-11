public class Static {
    /* Static = modifer, A single copy of a variable/method 
                is created and shared. The class "owns" the static member. */
    
@SuppressWarnings("unused")
public static void main(String[] args) {
    Friend friend1 = new Friend("Spongbob");
    Friend friend2 = new Friend("Patric");
    Friend friend3 = new Friend("Squidward");
    Friend friend4 = new Friend("sandy");

    Friend.displayFriends();

    

}
}
