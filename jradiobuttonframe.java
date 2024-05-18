import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class jradiobuttonframe extends JFrame implements ActionListener{

        jradiobuttonframe(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());

            JRadioButton pizzaButton = new JRadioButton("Pizza");
            JRadioButton hamburgerButton = new JRadioButton("hamburger");
            JRadioButton hotdogButton = new JRadioButton("hotdog");

            this.add(pizzaButton);
            this.add(hamburgerButton);
            this.add(hotdogButton);

            this.pack();
            this.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e){

        }
    }

