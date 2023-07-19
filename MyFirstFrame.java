
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MyFirstFrame extends JFrame{
    
    public MyFirstFrame() {
        
        setTitle("My First GUI");
        setSize(200, 250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
}
