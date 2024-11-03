package jframe;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class jframes {
    public static void main(String[] args) {
        // Jframe = . a GUI window to add components to
        /*JFrame frame = new JFrame(); // creates a frame
        frame.setSize(300, 400); // sets the size of the frame x- dimension and y- dimension
        frame.setTitle("Jframe title goes here"); // this set the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this is the default close operation
        frame.setResizable(false); // prevent resizing of the jframe
        frame.setVisible(true); // make frame visible

        ImageIcon Image = new ImageIcon("Alien.png"); // creates an image icon
        frame.setIconImage(Image.getImage()); // changes the Icon of Frame
        frame.getContentPane().setBackground(new Color(0x123456)); // change color of backgroung 
        */
        
        new myframe();

    }
}
