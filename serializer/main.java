package serializer;

import java.io.*;


public class main {
    public static void main(String[] args) throws IOException {
        /* Steps to Serialize
             -------------------------------------------------
            1. Your object class should implement Serializable interface
            2. add import java.io.Serializable;
            3.FileOutputStream fileOut = new FileOutputStream(file path)
            4.ObjectOutputStream out = new ObjectOutputStream(fileOut);
            5.out.writeObject(objectName)
            out.close(); fileout.close();
         * 
         */

        user User = new user();

        User.name = "Brian kim";
        User.password ="Password";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(User);
        out.close();
        fileOut.close();
        
        System.out.println("Object info saved! :");

        long SerialVersionUID = ObjectStreamClass.lookup(User.getClass()).getSerialVersionUID();
        System.out.println(SerialVersionUID);


    }
    
}
