import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menubarframe extends JFrame implements ActionListener{
    JMenuBar menuBar; 
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem SaveItem;
    JMenuItem ExitItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    menubarframe(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon();
        saveIcon = new ImageIcon();
        exitIcon = new ImageIcon();

       menuBar = new JMenuBar();

       fileMenu = new JMenu("File");
       editMenu = new JMenu("Edit");
       helpMenu = new JMenu("Help");

       loadItem = new JMenuItem("Load");
       SaveItem = new JMenuItem("Save");
       ExitItem = new JMenuItem("Exit");
   
        loadItem.addActionListener(this);
        SaveItem.addActionListener(this);
        ExitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        SaveItem.setIcon(saveIcon);
        ExitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F);// Alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E);//Alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H);// Alt + h for help
        loadItem.setMnemonic(KeyEvent.VK_L);// 1 for load
        SaveItem.setMnemonic(KeyEvent.VK_S);// 2 for save
        ExitItem.setMnemonic(KeyEvent.VK_E);// 3 for exit

        fileMenu.add(loadItem);
        fileMenu.add(SaveItem);
        fileMenu.add(ExitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==loadItem){
            System.out.println("**beep boop** you loaded a file");

        }
        if(e.getSource()==SaveItem){
            System.out.println("**beep boop** you Saved a file");

        }
        if(e.getSource()==ExitItem){
            System.out.println(0);

        }
    }
}
