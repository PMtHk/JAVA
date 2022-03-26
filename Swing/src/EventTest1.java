import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonEventTest extends JFrame implements ActionListener {
    private JLabel result = new JLabel("");
    // 이벤트 처리 결과 저장용 JLabel 객체 생성.
    public ButtonEventTest() {
        JButton male = new JButton("Male");
        JButton female = new JButton("Female");
        JLabel label = new JLabel("당신의 성별은? ");
        // 사용자 인터페이스 컴포넌트 생성.

        Container ct = getContentPane();
        // 프레임과 연관된 컨테이너 객체 생성

        ct.setLayout(new FlowLayout());
        // 컨테이너 객체 레이아웃 설정.
        ct.add(male);
        ct.add(female);
        ct.add(label);
        ct.add(result);
        // 컴포넌트를 컨테이너에 추가.

        male.addActionListener(this);
        female.addActionListener(this);
        // 버튼 객체에 이벤트 리스너 등록.

        setTitle("ButtonEvent Test");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent ae) {
        // 이벤트 처리 루틴 작성.
        result.setText(ae.getActionCommand());
        // 버튼 이름 읽기 -> 라벨로 출력.
    }
}

public class EventTest1 {
    public static void main(String[] args) {
        new ButtonEventTest();
    }
}
