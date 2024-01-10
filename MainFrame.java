import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
    final static int height = 600;
    final static  int width = height/2+100;
    JPanel MainPanel = new JPanel();
    JButton button0 = new JButton();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();

    MainFrame() {
       
       setSize(width,height);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        MainPanel.setBackground(Color.black);
       
        add(MainPanel);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
   
}
