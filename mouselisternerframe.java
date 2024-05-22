import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mouselisternerframe extends JFrame implements MouseListener{
    
    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;

    mouselisternerframe(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon();
        nervous = new ImageIcon();
        pain = new ImageIcon();
        dizzy = new ImageIcon();


        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        // label = new JLabel();
        // label.setBounds(0,0,100,100);
        // label.setBackground(Color.red);
        // label.setOpaque(true);
        // label.addMouseListener(this);

        // this.add(label);
        // this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
        System.out.println("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when a mouse button has been pressed on a component
        // System.out.println("Mouse Pressed");
        // label.setBackground(Color.yellow);
        label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a computer
        // System.out.println("You released the mouse");
        // label.setBackground(Color.red);
        label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse enters a component
        // System.out.println("You Entered Component");
        // label.setBackground(Color.green);
        label.setIcon(nervous);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component
        // System.out.println("You Exited");
        // label.setBackground(Color.blue);
        label.setIcon(smile);

    }
}
