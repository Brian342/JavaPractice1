public class genericsClasses{
    public static void main(String[] args) {
        //Generics
        Mygenericclass <Integer> myInt = new Mygenericclass(1);
        Mygenericclass <Double> myDouble = new Mygenericclass(3.14);
        Mygenericclass <Character> myChar = new Mygenericclass('@');
        Mygenericclass <String> myString = new Mygenericclass("Hello");

       System.out.println(myInt.getValue());
       System.out.println(myDouble.getValue());
       System.out.println(myChar.getValue());
       System.out.println(myString.getValue());

    }
    

} 