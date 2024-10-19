import javax.swing.JTextArea;
import javax.swing.JOptionPane;
// by extending JtextArea we can reuse all existing code of JtextArea
class PringGUI extends JTextArea implements Runnable {
   @Override
   public void run(){
// reuse append and getText methods of JTextArea
for (int b = -12; b < 12; b++)
append(Integer.toString(b) + "\t");
JOptionPane.showMessageDialog(null, getText(), "Print -12 to 11", JOptionPane.INFORMATION_MESSAGE);
   } 
}
//wrap Runnable object around Thread

public class class_lambda_expression {
    
}
public static void main (String args[]){
    PringGUI gui = new PringGUI();
    Thread th = new Thread(gui);
    th.start();
}

//Lmabda expressions
//(par 1, par 2) -> {code block}

public class LambdaRunnable{
    public static void main(String args[]){
        Runnable runnable = ()->{for (int i = 1; i< 20; i+= 2}
    }
}