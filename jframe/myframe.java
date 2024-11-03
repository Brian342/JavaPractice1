package jframe;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myframe extends JFrame{
    myframe(){

        this.setSize(300, 400); // sets the size of the this x- dimension and y- dimension
        this.setTitle("Jthis title goes here"); // this set the title of the this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this is the default close operation
        this.setResizable(false); // prevent resizing of the jthis
        this.setVisible(true); // make this visible

        ImageIcon Image = new ImageIcon("Alien.png"); // creates an image icon
        this.setIconImage(Image.getImage()); // changes the Icon of this
        this.getContentPane().setBackground(new Color(0x123456)); // change color of backgroung 


    }

}
