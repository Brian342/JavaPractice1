package serializer;

import java.io.Serializable;

public class user implements Serializable{
    String name;
    transient String password;

    public void sayHello(){
        System.out.println("Hello ");
    }
}
