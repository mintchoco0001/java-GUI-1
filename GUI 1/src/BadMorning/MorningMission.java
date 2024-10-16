package BadMorning;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class MorningMission extends JFrame {
    String id = "user";
    String pw = "qlalfqjsgh";

    public MorningMission() {
        setTitle("로그인 박스");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        JLabel jl1 = new JLabel("아이디 : ");
        jl1.setBounds(65,30,100,100);
        JLabel jl2 = new JLabel("비밀번호 : ");
        jl2.setBounds(65,60,100,100);
        JTextField jt1 = new JTextField();
        jt1.setBounds(150,70,100,20);
//        JTextField jt2 = new JTextField("비밀번호");
        JPasswordField jt2 = new JPasswordField();
        jt2.setBounds(150,100,100,20);
        JButton btn = new JButton("로그인");
        btn.setBounds(100,175,100,100);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputId = jt1.getText(); // 아이디 필드에서 입력된 값 가져오기
                String inputPw = jt2.getText(); // 비밀번호 필드에서 입력된 값 가져오기
                getMessage(inputId, inputPw); // getMessage 메소드 호출하여 아이디와 비밀번호 전달
            }
        });
        c.add(jl1);
        c.add(jl2);
        c.add(jt1);
        c.add(jt2);
        c.add(btn);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MorningMission();
    }

    private void getMessage(String inputId, String inputPw) {
        if (inputId.equals(id) && inputPw.equals(pw)) {
            JOptionPane.showConfirmDialog(null, "로그인 성공", "로그인", JOptionPane.OK_CANCEL_OPTION); 
        } else if(inputId.equals("아이디") || inputPw.equals("비밀번호")) {
            JOptionPane.showConfirmDialog(null, "아이디 또는 비밀번호를 입력하세요", "로그인", JOptionPane.OK_CANCEL_OPTION);
        } else {
            JOptionPane.showConfirmDialog(null, "로그인 실패", "로그인", JOptionPane.OK_CANCEL_OPTION);
        }
    }
}
