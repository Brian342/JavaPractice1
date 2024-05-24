import javax.swing.JFrame;

public class twodanimationframe extends JFrame{
    
    twodanimationpanel panel;
    twodanimationframe(){
        panel = new twodanimationpanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
