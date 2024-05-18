import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class jradiobuttonframe extends JFrame implements ActionListener{
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzIcon;
    ImageIcon hamburIcon;
    ImageIcon hotdogIcon;

        jradiobuttonframe(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new FlowLayout());

            pizzIcon = new ImageIcon("download.jpeg");
            hamburIcon = new ImageIcon("hamburger.png");
            hotdogIcon = new ImageIcon("hotdog.jpeg");

            pizzaButton = new JRadioButton("Pizza");
            hamburgerButton = new JRadioButton("hamburger");
            hotdogButton = new JRadioButton("hotdog");

            ButtonGroup group = new ButtonGroup();
            group.add(pizzaButton);
            group.add(hamburgerButton);
            group.add(hotdogButton);

            pizzaButton.addActionListener(this);
            hamburgerButton.addActionListener(this);
            hotdogButton.addActionListener(this);

            pizzaButton.setIcon(pizzIcon);
            hamburgerButton.setIcon(hamburIcon);
            hotdogButton.setIcon(hotdogIcon);


            this.add(pizzaButton);
            this.add(hamburgerButton);
            this.add(hotdogButton);

            this.pack();
            this.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==pizzaButton){
                System.out.println("You ordered Pizza!");
            }
            else if(e.getSource()==hamburgerButton){
                System.out.println("You ordered hamburger!");
        }
        else if(e.getSource()==hotdogButton){
            System.out.println("You ordered hotdog!");
        }
    }

}