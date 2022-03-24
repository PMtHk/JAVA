import javax.swing.*;
import java.awt.*;
class JPanel1 extends JFrame{
    public JPanel1() {
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());

        JPanel jp1 = new JPanel(); // 첫 번째 패널.
        jp1.setLayout(new GridLayout(5,1));
        jp1.add(new JRadioButton("JAVA"));
        jp1.add(new JRadioButton("C"));
        jp1.add(new JRadioButton("VisualBasic"));
        jp1.add(new JRadioButton("JSP"));
        jp1.add(new JRadioButton("RHP"));

        JPanel jp2 = new JPanel(); // 두 번째 패널.
        jp2.setLayout(new GridLayout(5,1));
        jp2.add(new JButton("자바"));
        jp2.add(new JButton("C"));
        jp2.add(new JButton("VisualBaisc"));
        jp2.add(new JButton("JSP"));
        jp2.add(new JButton("RHP"));

        ct.add(jp1, BorderLayout.WEST);
        ct.add(jp2, BorderLayout.EAST);

        setTitle("JPanel Test");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class JPanelTest {
    public static void main(String[] args) {
        new JPanel1();
    }
}
