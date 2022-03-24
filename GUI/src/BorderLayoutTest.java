import javax.swing.*;
import java.awt.*;
class BorderLayout1 extends JFrame{
    public BorderLayout1() {
        Container ct = getContentPane();
        BorderLayout b1 = new BorderLayout(10, 10);
        ct.setLayout(b1);

        ct.add(new JButton("오른쪽 버튼"), BorderLayout.EAST);
        ct.add(new JButton("왼쪽 버튼"), BorderLayout.WEST);
        ct.add(new JButton("위쪽 버튼"), BorderLayout.NORTH);
        ct.add(new JButton("아래쪽 버튼"), BorderLayout.SOUTH);
        ct.add(new JButton("중앙 버튼"), BorderLayout.CENTER);

        setTitle("BorderLayout Test");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 없으면 프로세스 끝나지 않는다.
        setVisible(true);
    }
}
public class BorderLayoutTest {
    public static void main(String[] args) {
        new BorderLayout1();
    }
}
