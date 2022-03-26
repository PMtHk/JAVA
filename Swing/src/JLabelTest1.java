import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JLabelDemo extends JFrame implements ActionListener {
    private JLabel result = new JLabel("");
    public JLabelDemo() {
        ImageIcon ii = new ImageIcon("backspace.jpg");
        // 이미지 객체 생성.
        JButton backspace = new JButton("", ii);
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        ct.add(backspace);
        ct.add(result);
        backspace.addActionListener(this);
        setTitle("JLabelTest");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        result.setText("뒤로가기 버튼입니다.");
    }
}

public class JLabelTest1 {
    public static void main(String[] args) {
        new JLabelDemo();
    }
}
