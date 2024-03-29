import javax.swing.*;
import java.awt.*;

class CirclePanel extends JPanel{
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(10, 10, 50, 50);
        g.fillOval(100, 10,75,50);
        g.drawArc(210,50,70,70,0,75);
        g.fillArc(150, 50, 90,90,0,75);
        g.drawArc(10, 100,70,80,0,175);
        g.fillArc(100,100,70,90,180,270);
    }
}
class CircleFrame extends JFrame {
    public CircleFrame() {
        setTitle("DrawCircle Test");
        Container ct = getContentPane();
        ct.add(new CirclePanel());
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class CircleTest {
    public static void main(String[] args) {
        new CircleFrame();
    }
}
