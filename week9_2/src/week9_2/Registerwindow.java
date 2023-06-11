package week9_2;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Registerwindow extends JFrame {
	static final int NUMBER_OF_ITEMS = 8;
	static final int SIZE_OF_WIDTH = 300;
	static final int SIZE_OF_HEIGHT = 500;
	static final int ITEM_SIZE_HEIGHT = 50;
	static final String FRAME_TITLE = "도서 등록";
	static final String GUIDE_TEXT = "아래에 항목을 입력하세요.";

	Registerwindow(int Main_x, int Main_y) {
		setSize(SIZE_OF_WIDTH, SIZE_OF_HEIGHT);
		setTitle(FRAME_TITLE);
		this.setLocation(Main_x + Mainframe.MAIN_WINDOW_WIDTH, Main_y);
		JPanel panel = new JPanel();
		JPanel[] p = new JPanel[NUMBER_OF_ITEMS];
		for (int n = 0; n < NUMBER_OF_ITEMS; n++) {
			p[n] = new JPanel();
			p[n].setPreferredSize(new Dimension(SIZE_OF_WIDTH, ITEM_SIZE_HEIGHT));
			panel.add(p[n]);
		}
		JLabel guide = new JLabel(GUIDE_TEXT);
		p[0].add(guide);

		JTextField t1 = new JTextField(15); // 리팩토링 할 코드
		JLabel l1 = new JLabel("출판사");
		p[1].add(l1);
		p[1].add(t1);
		JTextField t2 = new JTextField(15);
		JLabel l2 = new JLabel("제 목");
		p[2].add(l2);
		p[2].add(t2);
		JTextField t3 = new JTextField(15);
		JLabel l3 = new JLabel("저 자");
		p[3].add(l3);
		p[3].add(t3);
		JTextField t4 = new JTextField(15);
		JLabel l4 = new JLabel("ISBN");
		p[4].add(l4);
		p[4].add(t4);
		JTextField t5 = new JTextField(15);
		JLabel l5 = new JLabel("카테고리");
		p[5].add(l5);
		p[5].add(t5);
		JTextField t6 = new JTextField(15);
		JLabel l6 = new JLabel("페이지수");
		p[6].add(l6);
		p[6].add(t6);

		JButton b1 = new JButton("등		록");
		JButton b2 = new JButton("취		소");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // call back
				// TODO Auto-generated method stub
				BookRegister.registerBook(t1.getText(), t2.getText(), t3.getText(), t4.getText(), t5.getText(),
						t6.getText());

			}

		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // call back
				// TODO Auto-generated method stub
				setVisible(false);
			}

		});
		p[7].add(b1);
		p[7].add(b2);

		for (int t = 0; t < NUMBER_OF_ITEMS; t++) {
			panel.add(p[t]);
		}
		this.add(panel);
		setVisible(true);

	}
}