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
