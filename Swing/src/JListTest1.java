import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

class JListDemo extends JFrame implements ListSelectionListener {
    private String[] objList = {"germany", "usa", "korea", "바나나", "사과"};
    private JList jlst = new JList(objList);
    private ImageIcon[] objicons = {
            new ImageIcon("germany.png"),
            new ImageIcon("usa.png"),
            new ImageIcon("korea.png"),
            new ImageIcon("바나나.png"),
            new ImageIcon("사과.png")
    };
    private JLabel[] jlicon = new JLabel[6];
    public JListDemo() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(3,2,5,5));
        for (int i = 0; i < 5; i++) {
            p.add(jlicon[i] = new JLabel());
        }
        Container c = getContentPane();
        c.add(jlst, BorderLayout.WEST);
        c.add(p, BorderLayout.CENTER);
        jlst.addListSelectionListener(this);
        setTitle("JList Test1");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void valueChanged(ListSelectionEvent lse) {
        for (int i = 1; i < 5; i++) {
            jlicon[i].setIcon(null);
        }
        int[] indices = jlst.getSelectedIndices();
        for (int j = 0; j < indices.length; j++) {
            jlicon[j].setIcon(objicons[indices[j]]);
        }
    }

}


public class JListTest1 {
    public static void main(String[] args) {
        new JListDemo();
    }
}
