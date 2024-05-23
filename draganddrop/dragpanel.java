package draganddrop;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;

public class dragpanel extends JPanel{
    
    ImageIcon image = new ImageIcon("smile.png");

    dragpanel(){

    }
    public void paintComponent(Graphics g){

    }

    private class ClickListener extends MouseAdapter{

    }
    private class DragListener extends MouseMotionAdapter{
        
    }
}
