import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class mouselisternerframe extends JFrame implements MouseListener{
    
    mouselisternerframe(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when a mouse button has been pressed on a component
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Invoked when a mouse button has been released on a computer
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //Invoked when the mouse enters a component
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //Invoked when the mouse exits a component
    }
}
