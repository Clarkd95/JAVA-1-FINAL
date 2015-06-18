
package finalprj;

import java.awt.*;
import javax.swing.*;

public class FinalPrj 
{

    public static void main(String[] args) throws AWTException
    
    {
        JFrame frame = new JFrame("Color Blind Assistant");
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
       
        
        Robot rob = new Robot();
        rob.delay(20);
        JPanel p1 = new JPanel();
        frame.getContentPane().add(p1);
        JPanel p2 = new JPanel(); 
        frame.add(p2);
        JLabel lab = new JLabel();
        lab.setVisible(true);
        lab.setFont(new Font("Monospace", Font.PLAIN, 30));        
        JPanel p3 = new JPanel();
        frame.add(p3);
        p3.add(lab);        
       
            while(true)
        {
        PointerInfo a = MouseInfo.getPointerInfo();
        Point mouse = a.getLocation();
        Color read = rob.getPixelColor(mouse.x,mouse.y);
        p1.setBackground(read);
        p2.setBackground(read);
        int green = read.getGreen();
        int blue = read.getBlue();
        int red = read.getRed();        
        lab.setText("Red: "+red+"  Green: "+green+"  Blue: "+blue);

        }

    }
    
}       
