package package2;
import package1.*;

public class c {

    public String publicMessage = "This is a public message!"; // using public modifier
    protected String protectedMessage = "This is a protected message"; //something protected mean it is accessible to different class so long it is a sub class
    private String privateMessage = "This is a private message";// only visible to class that contain it self
    String defaultMessage = "This is the default"; //using default modifier
}
