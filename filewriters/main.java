package filewriters;

import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("poem.txt")) {
            writer.write("Roses are red\n Violets are blue\n Booty, booty, booty, booty");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
