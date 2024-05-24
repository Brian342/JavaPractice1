
import javax.swing.JFrame;

public class twodghaphicsframe extends JFrame{
   twodgraphicsmypanel panel;


    twodghaphicsframe(){
        panel = new twodgraphicsmypanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }
   
}