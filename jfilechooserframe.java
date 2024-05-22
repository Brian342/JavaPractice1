import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class jfilechooserframe extends JFrame implements ActionListener{
    JButton button;

    jfilechooserframe (){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

       button = new JButton("File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {

            JFileChooser fileChooser = new JFileChooser();
            
            fileChooser.setCurrentDirectory(new File("."));
            // int response = fileChooser.showOpenDialog(null);//select file to open
            int response = fileChooser.showSaveDialog(null); // select file to save


            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
            
        }
    }
}
