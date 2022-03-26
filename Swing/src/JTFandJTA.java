import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTFandJTADemo extends JFrame implements ActionListener {
    private JTextField jtf;
    private JTextArea jta;
    public JTFandJTADemo() {
        jtf = new JTextField(20);
        jta = new JTextArea(7,20);

        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        ct.add(jtf);
        ct.add(jta);
        jtf.addActionListener(this);
        setTitle("JTextField, JTextArea Test");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        jta.append(ae.getActionCommand() + "\n");
        // 텍스트 에리어에 문자열을 추가 (append)
        jtf.setText("");
        // 텍스트 필드 초기화
    }
}

public class JTFandJTA {
    public static void main(String[] args) {
        new JTFandJTADemo();
    }
}
