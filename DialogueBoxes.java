import javax.swing.*;

public class DialogueBoxes{
    public static void main(String[] args) {
        /*JOptionPane = pop up a standard dialog box that prompts 
        users for a value or informs them of something */

        // JOptionPane.showMessageDialog(null, "This is some Useless Info", "Title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Here is more Useless Info", "Title", JOptionPane.INFORMATION_MESSAGE);
        // while (true) {
        //     JOptionPane.showMessageDialog(null, "You're computer has a virus", "Title", JOptionPane.QUESTION_MESSAGE);

        // }
        // JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!!!!", "Title", JOptionPane.ERROR_MESSAGE);

    //    int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my Title", JOptionPane.YES_NO_CANCEL_OPTION);
    //   String name =  JOptionPane.showInputDialog("What is your name");
    //   System.out.println("Hello " + name);
    String[] responses = {"No, you're awesome!", "thank you!", "*blush*"};
    ImageIcon icon = new ImageIcon("smile.png");

      JOptionPane.showOptionDialog(null, 
      "You are awesome", "Secret message", 
      JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
      icon, responses, 
      0);
    }
}