package draganddrop;

import javax.swing.JFrame;

public class myframe extends JFrame{
    
    dragpanel DragPanel = new dragpanel();
    
    myframe(){

        this .add(DragPanel);
        this.setTitle("Drag & Drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
