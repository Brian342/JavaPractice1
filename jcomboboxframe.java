import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jcomboboxframe extends JFrame implements ActionListener{
    
    JComboBox comboBox;
    @SuppressWarnings("unchecked")
    jcomboboxframe(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};

       comboBox = new JComboBox(animals);
       comboBox.addActionListener(this);

       comboBox.setEditable(true);
      System.out.println( comboBox.getItemCount());
      comboBox.addItem("Horse");
      comboBox.insertItemAt("Pig", 0);
    //   comboBox.removeItem("bird");
    //   comboBox.setSelectedIndex(0);
    //   comboBox.removeItemAt(0);
    //   comboBox.removeAllItems();
      

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
        //    System.out.println(comboBox.getSelectedItem()); 
        System.out.println(comboBox.getSelectedIndex());
        }
    }
    }
   
