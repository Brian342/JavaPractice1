import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class jlayeredpane {
    public static void main(String[] args) {

        /*JLayeredPane = swing container that provides a third dimension for positioning components
         *               ex. depth, z-index
         */

         JLabel label1 = new JLabel();
         label1.setOpaque(true);
         label1.setBackground(Color.red);
         label1.setBounds(50,50,200,200);

         JLabel label2 = new JLabel();
         label2.setOpaque(true);
         label2.setBackground(Color.gray);
         label2.setBounds(100,100,200,200);

         JLabel label3 = new JLabel();
         label3.setOpaque(true);
         label3.setBackground(Color.black);
         label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(1));
        layeredPane.add(label3, Integer.valueOf(2));


        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
