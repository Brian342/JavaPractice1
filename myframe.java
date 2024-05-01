import javax.swing.*;
import java.awt.Color;
public class myframe extends JFrame{

    myframe(){

        this.setTitle("JFrame title goes here");//sets title for frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
        this.setResizable(false);//prevent frame from being resized
        this.setSize(420,420); //sets the x and y dimension of frame
        this.setVisible(true);// make frame visible

        ImageIcon image = new ImageIcon("logo.png");// create an ImageIcon
        this.setIconImage(image.getImage());//change Icon of Frame
        // this.getContentPane().setBackground(Color.gray);//change color of background
        // this.getContentPane().setBackground(new Color(0,255,255));
        this.getContentPane().setBackground(new Color(0x123456));//using hexadecimal


    }
}
