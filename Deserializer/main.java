package Deserializer;
import java.io.*;
public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /* Steps to Deserializer
            -----------------------------------------------------
            1.Declare your object (don't instantiate)
            2.Your class should implement Serializable interface
            3.add import java.io.Serializable;
            4.FileInputStream fileIn = new FileInputStrea(file path);
            5.ObjectInputStream in = new objectInputStream(fileIn)
            6.objectName = (class) in.readobject();
            7.in.clode(); fileIn.close();

            Important notes 
            1. children classes of a parent class that implements serializable 
                will do as well
            2. static fields are not serialized (they belong to the class, not an individual object)
            3. The class's definition ("Class file") itself is not recorded, cast it as the object type
            4. Fields declared as "transient" aren't serialized, they're ignored
            5. SerialVersionUID is a unique version ID
         * 
         */
 
         user User = null;

         FileInputStream fileIn = new FileInputStream("/Users/briankimanzi/Documents/JavaPractice/serializer/UserInfo.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         User = (user) in.readObject();
         in.close();
         fileIn.close();

         System.out.println(User.name);
         System.out.println(User.password);
         User.sayHello();


    }
    
}
