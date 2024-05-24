import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class twodgraphicsmypanel extends JPanel{
    
    twodgraphicsmypanel(){
        this.setPreferredSize(new Dimension(500,500));
    }
        public void paint(Graphics g){

            Graphics2D g2D = (Graphics2D) g;
            
            g2D.setPaint(Color.BLUE);
            g2D.setStroke(new BasicStroke(5));
            // g2D.drawLine(0, 0, 500, 500);

            g2D.setPaint(Color.pink);
            // g2D.drawRect(0,0,100,200);
            g2D.fillRect(0,0,100,200);
        }
    }
    

