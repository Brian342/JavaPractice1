package Deserializer;

import java.io.Serializable;

public class user implements Serializable{

    private static final long serialVersionUID = 1;
    String name;
    transient String password;

    public void sayHello(){
        System.out.println("Hello ");
    }
}
