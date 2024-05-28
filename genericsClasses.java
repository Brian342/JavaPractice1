import java.util.ArrayList;

public class genericsClasses{
    public static void main(String[] args) {
        //Generics
        Mygenericclass <Integer,Integer> myInt = new Mygenericclass<>(1,9);
        Mygenericclass <Double, Double> myDouble = new Mygenericclass<>(3.14, 1.9);
        Mygenericclass <Character,Character> myChar = new Mygenericclass<>('@','#');
        Mygenericclass <String,Character> myString = new Mygenericclass <> ("Hello",'!');

       ArrayList<String> myFriends = new ArrayList<>();

       System.out.println(myInt.getValue());
       System.out.println(myDouble.getValue());
       System.out.println(myChar.getValue());
       System.out.println(myString.getValue());

    }
    

} 