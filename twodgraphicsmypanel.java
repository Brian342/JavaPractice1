import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class twodgraphicsmypanel extends JPanel{
    
    Image image; 

    twodgraphicsmypanel(){

        image = new ImageIcon("logo.png").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }
        public void paint(Graphics g){

            Graphics2D g2D = (Graphics2D) g;
            
            g2D.drawImage(image, 0, 0,null);

            g2D.setPaint(Color.BLUE);
            // g2D.setStroke(new BasicStroke(5));
            // g2D.drawLine(0, 0, 500, 500);

            // g2D.setPaint(Color.pink);
            // // g2D.drawRect(0,0,100,200);
            // g2D.fillRect(0,0,100,200);

            // g2D.setPaint(Color.orange);
            // // g2D.drawOval(0, 0, 100, 100);
            // g2D.fillOval(0, 0, 100, 100);

            g2D.setPaint(Color.red);
            // g2D.drawArc(0, 0, 100, 100, 180, 100);
            g2D.fillArc(0, 0, 100, 100, 0, 180);
            g2D.setPaint(Color.white);
            g2D.fillArc(0, 0, 100, 100, 180, 180);

            int[] xpoint = {150, 250,350};
            int[] ypoint = {300, 150,300};
            g2D.setPaint(Color.yellow);
            // // g2D.drawPolygon(xpoint,ypoint,3);
            g2D.fillPolygon(xpoint,ypoint,3);

            // g2D.setPaint(Color.magenta);
            // g2D.setFont(new Font("Monospaced", Font.BOLD,50));
            // g2D.drawString("U R A WINNER", 50, 50);

           
        }
    }
    

