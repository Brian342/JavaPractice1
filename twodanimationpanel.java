import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class twodanimationpanel extends JPanel implements ActionListener{

    final int PANEL_WIDTH = 150;
    final int PANEL_HEIGHT = 150;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    twodanimationpanel(){

        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        backgroundImage = new ImageIcon("space.png").getImage();
        enemy = new ImageIcon("Alien.png").getImage();
        timer = new Timer(10,this);
        timer.start();

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); // paint Background

        Graphics2D g2D = (Graphics2D) g;
        
        g2D.drawImage(backgroundImage,0,0,null);
        g2D.drawImage(enemy, x, y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=PANEL_WIDTH-enemy.getWidth(null) || x < 0){
            xVelocity = xVelocity * -1;
        }
         x = x + xVelocity;
        if(y>=PANEL_HEIGHT-enemy.getHeight(null) || y < 0){
                yVelocity = yVelocity * -1;
            }
             y = y + xVelocity;
          repaint();
    }
}

