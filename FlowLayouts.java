import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FlowLayouts {
    public static void main(String[] args) {
        /* Layout Manager = Defines the natural layout for components within a container
         * 
         * flowLayout = places components in a row, sized at their preferred size.
         *              If the horizontal space in the container is too small,
         *              the flowLayout class uses the next available row.
        */

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0)); // Leading makes button apper on the left, Trailing make the buttons apper on the right and center makes them be on the center. the 0,0 are for horizontal spacing and vertical spacing respectively


        //JButton button1 = new JButton();

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(250, 250));
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(new FlowLayout());

        panel1.add(new JButton("1"));
        panel1.add(new JButton("2"));
        panel1.add(new JButton("3"));
        panel1.add(new JButton("4"));
        panel1.add(new JButton("5"));
        panel1.add(new JButton("6"));
        panel1.add(new JButton("7"));
        panel1.add(new JButton("8"));
        panel1.add(new JButton("9"));

        frame.add(panel1);
    //------------------ frame ---------------------        
        // frame.add(new JButton("2"));
        // frame.add(new JButton("1"));
        // frame.add(new JButton("3"));
        // frame.add(new JButton("4"));
        // frame.add(new JButton("5"));
        // frame.add(new JButton("6"));
        // frame.add(new JButton("7"));
        // frame.add(new JButton("8"));
        // frame.add(new JButton("9"));

        frame.setVisible(true);

    }
}
