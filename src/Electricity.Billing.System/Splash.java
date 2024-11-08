package  electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash(){                                                   //construsctor name same as class
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Splash.jpg"));
        Image imageone = imageIcon.getImage().getScaledInstance(600,400, Image.SCALE_DEFAULT);
        ImageIcon imageIconTwo = new ImageIcon(imageone);
        JLabel imagelabel = new JLabel(imageIconTwo);
        add(imagelabel);

        setSize(600,400);
        setLocation(550,200);
        setVisible(true);

        try {
            Thread.sleep(3000);
            setVisible(false);
            new Login();
        }catch (Exception t){
            t.printStackTrace();
        }

    }
    public static void main(String[] args) {                    // meathod
        new Splash();                                           // object splash name ka...

    }
}
