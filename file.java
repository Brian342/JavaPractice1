import java.io.File;
public class file {
    public static void main(String[] args) {
        /* file = An abstract representation of file and directory pathnames  */

        File file = new File("copy.txt");

        if(file.exists()){
            System.out.println("That file exists! :o!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());//gets the location of the file
            System.out.println(file.isFile());//returns boolean value if that is a file or not
            file.delete();//deletes the file
        }
        else{
            System.out.println("That file doesn't exist :(");
        }
    }
}
