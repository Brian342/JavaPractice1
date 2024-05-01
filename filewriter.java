import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    
    public static void main(String[] args) {
        
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nviolets are new \nBooty booty booty booty booty \nRocking everywhere ");
            writer.append("\n(A poem by brian)");
            writer.close();
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
