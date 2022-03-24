import javax.swing.*;
import java.awt.*;

class GridLayout1 extends JFrame{
    public  GridLayout1() {
        Container ct = getContentPane();
        GridLayout gl = new GridLayout(3, 5, 5, 5);
                                        // 행, 열, 수직간격, 수평간격 (위 경우 수직, 수평 간격 10)
        ct.setLayout(gl);
        for (int i=1; i<=15; i++) {
            ct.add(new JButton("버튼" + i));
        }
        setTitle("GridLayout Test");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class GridLayoutTest { // 그리드 레이아웃
    public static void main(String[] args) {
        new GridLayout1();
    }
}
