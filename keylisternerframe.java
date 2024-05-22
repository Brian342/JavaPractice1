import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class keylisternerframe extends JFrame implements KeyListener{

    JLabel label;
    ImageIcon icon;

    keylisternerframe (){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("");

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        // label.setBackground(Color.red);
        // label.setOpaque(true);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped = Invoked when a key is typed.uses keychar, char output


    }

    @Override
    public void keyPressed(KeyEvent e) {
       //keyPressed = Invoked when a physical key is pressed down.uses keycode, int output
       switch (e.getKeyCode()) {
        case 37: label.setLocation(label.getX()-10,label.getY());
            break;
        case 38:label.setLocation(label.getX(), label.getY()-10);
            break;
        case 39:label.setLocation(label.getX()+10, label.getY()+10);
            break;
        case 40: label.setLocation(label.getX(), label.getY()+10);
        default:
            break;
    }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased = called whenever a button is released
        System.out.println("You released key character " + e.getKeyChar());
        System.out.println("You released key character " + e.getKeyCode());

    }

}
