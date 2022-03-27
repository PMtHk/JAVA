import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JComboBoxDemo extends JFrame implements ItemListener {
    JLabel jl;
    public JComboBoxDemo() {
        jl = new JLabel(new ImageIcon("germany.png"));
        JComboBox jc = new JComboBox();
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        ct.add(jl);
        jc.addItem("germany");
        jc.addItem("korea");
        jc.addItem("usa");
        jc.addItem("바나나");
        jc.addItem("사과");

        ct.add(jc);
        jc.addItemListener(this);
        setTitle("JCombobox Test1");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie) {
        String object = (String) ie.getItem();
        jl.setIcon(new ImageIcon(object+".png"));
    }
}

public class JComboBoxTest1 {
    public static void main(String[] args) {
        new JComboBoxDemo();
    }
}
