import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JButtonDemo1 extends JFrame {
    public JButtonDemo1() {
        ImageIcon korea = new ImageIcon("korea.jpg");
        ImageIcon usa = new ImageIcon("usa.png");
        ImageIcon germany = new ImageIcon("germany.png");

        JButton nat = new JButton(korea);
        nat.setPressedIcon(usa);
        nat.setRolloverIcon(germany);
        Container ct = getContentPane();
        ct.add(nat);
        setTitle("JButton Test1");
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}

public class JButtonTest1 {
    public static void main(String[] args) {
        new JButtonDemo1();
    }
}
