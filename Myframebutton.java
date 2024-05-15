import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Myframebutton extends JFrame implements ActionListener{ 

    JButton button;
    JLabel label;
    Myframebutton(){

        ImageIcon Icon = new ImageIcon("logo.png");
        ImageIcon Icon2 = new ImageIcon("logo.png");

        label = new JLabel();
        label.setIcon(Icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.addActionListener(e -> System.out.println("Boo"));
        button.setText("I'm a Button!");
        button.setFocusable(false);
        button.setIcon(Icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("comic sans", Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
        //System.out.println("BOO!");
        //button.setEnabled(false);
        label.setVisible(true);
       }
    }



}
