public class genericsClasses{
    public static void main(String[] args) {
        //Generics
        MyIntergerClass myInt = new MyIntergerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");

       System.out.println(myInt.getValue());
       System.out.println(myDouble.getValue());
       System.out.println(myChar.getValue());
       System.out.println(myString.getValue());

    }
    

}