import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JButtonDemo2 extends JFrame implements ActionListener {
    JTextField jtf;
    public JButtonDemo2() {
        jtf = new JTextField(10);
        ImageIcon apple = new ImageIcon("사과.png");
        ImageIcon banana = new ImageIcon("바나나.png");
        ImageIcon persimmon = new ImageIcon("감.jpeg");
        ImageIcon pear = new ImageIcon("배.jpeg");
        ImageIcon grape = new ImageIcon("포도.jpeg");

        JButton jb1 = new JButton("사과", apple);
        JButton jb2 = new JButton("바나나", banana);
        JButton jb3 = new JButton("감", persimmon);
        JButton jb4 = new JButton("배", pear);
        JButton jb5 = new JButton("포도", grape);

        Container ct = getContentPane();
        ct.setLayout(new GridLayout(3,2));
        ct.add(jb1);
        ct.add(jb2);
        ct.add(jb3);
        ct.add(jb4);
        ct.add(jb5);
        ct.add(jtf);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);

        setTitle("JButton Test2");
        setSize(200,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        jtf.setText(ae.getActionCommand());
    }
}


public class JButtonTest2 {
    public static void main(String[] args) {
        new JButtonDemo2();
    }
}
