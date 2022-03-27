import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JRadioButtonDemo extends JFrame implements ActionListener {
    JTextField jtf;
    public JRadioButtonDemo() {
        jtf = new JTextField(10);
        JRadioButton jr1 = new JRadioButton("option A");
        JRadioButton jr2 = new JRadioButton("option B");
        JRadioButton jr3 = new JRadioButton("option C");
        JRadioButton jr4 = new JRadioButton("option D");

        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        ButtonGroup gb = new ButtonGroup(); // 버튼 그룹 객체 생성.

        gb.add(jr1);
        gb.add(jr2);
        gb.add(jr3);
        gb.add(jr4);    // 각 라디오 버튼들을 하나의 그룹으로 묶기.

        ct.add(jr1);
        ct.add(jr2);
        ct.add(jr3);
        ct.add(jr4);
        ct.add(jtf);    // 화면 표시할 것들...

        jr1.addActionListener(this);
        jr2.addActionListener(this);
        jr3.addActionListener(this);
        jr4.addActionListener(this);

        setTitle("JRadioButtonTest1");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        jtf.setText(ae.getActionCommand());
    }
}


public class JRadioButtonTest1 {
    public static void main(String[] args) {
        new JRadioButtonDemo();
    }
}
