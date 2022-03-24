import javax.swing.*;
import java.awt.*;

class ColorPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawString("빨간색 RED", 50, 50);
        // 문자열을 그래픽으로 그리기.
        g.setColor(Color.BLUE);
        g.drawString("파란색 BLUE", 50, 80);
        Color c1 = new Color(100, 255, 100);
        Color c2 = new Color(255, 100, 255);

        g.setColor(c1);
        g.fillRect(50, 100, 60, 50);
        g.setColor(c2);
        g.fillOval(130, 100, 90, 30);
        g.setColor(Color.cyan);
        g.fillRoundRect(50, 190, 200, 50, 15, 15);
    }
}

class ColorFrame extends JFrame {
    public ColorFrame() {
        setTitle("Color Test");
        Container ct = getContentPane();
        add(new ColorPanel());
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class ColorTest {
    public static void main(String[] args) {
        new ColorFrame();
    }
}
