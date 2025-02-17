package labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class labels {
    
    public static void main(String[] args) {


        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon Image = new ImageIcon("Alien.png");

        JLabel label = new JLabel(); // Create a label
        label.setText("Bro do you even Code"); // set text of label 
        label.setIcon(Image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageIcon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of ImageIcon
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("MV Boli", Font.ITALIC, 10));

        JFrame frame = new JFrame();
        frame.setTitle("This is a label Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().setBackground(new Color(255, 255, 255)); //0x123456
        frame.setVisible(true);
        // MyLabel.add(label);
        frame.add(label);

    }
}
;