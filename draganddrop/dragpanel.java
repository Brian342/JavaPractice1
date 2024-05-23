package draganddrop;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class dragpanel extends JPanel{
    
    ImageIcon image = new ImageIcon("smile.png");
   final int WIDTH = image.getIconWidth();
   final int HEIGHT = image.getIconHeight();
   Point imageCorner;
   Point prevPt;

    dragpanel(){

        imageCorner = new Point(0,0);
        ClickListener clicklistener = new ClickListener();
        DragListener draglistener = new DragListener();
        this.addMouseListener(clicklistener);
        this.addMouseMotionListener(draglistener);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){

            Point currentPt = e.getPoint();

            imageCorner.translate(
                (int)(currentPt.getX() - prevPt.getX()),
                (int)(currentPt.getY() - prevPt.getY())
                );
                prevPt = currentPt;
                repaint();
        }
    }
}
