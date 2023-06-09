package week9_2;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mainframe extends JFrame {
	static final int MAIN_WINDOW_WIDTH = 300;
	static final int MAIN_WINDOW_HEIGHT = 50;
	Mainframe me;

	public Mainframe() {
		me = this;
		JFrame frame = new JFrame();
		frame.setSize(MAIN_WINDOW_WIDTH, MAIN_WINDOW_WIDTH);
		frame.setTitle("도서 등록 GUI");
		JPanel panel = new JPanel();
		JPanel p1 = new JPanel();
		p1.setPreferredSize(new Dimension(MAIN_WINDOW_WIDTH, MAIN_WINDOW_HEIGHT));
		JPanel p2 = new JPanel();
		p2.setPreferredSize(new Dimension(MAIN_WINDOW_WIDTH, MAIN_WINDOW_HEIGHT));
		JLabel l1 = new JLabel("실행할 업무를 선택하시오.");

		JButton b1 = new JButton();
		b1.setText("도서등록");
		JButton b2 = new JButton();
		b2.setText("대     출");
		JButton b3 = new JButton();
		b3.setText("도서  정보");

		p1.add(l1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // call back
				// TODO Auto-generated method stub
				Point p = me.getLocation();
				new Registerwindow(p.x, p.y);
			}

		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Point p = me.getLocation();
				new Rentwindow(p.x, p.y + MAIN_WINDOW_WIDTH);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Point p = me.getLocation();
				new BookListWindow(p.x + 2 * MAIN_WINDOW_WIDTH, p.y);
			}
		});
		panel.add(p1);
		panel.add(p2);
		frame.add(panel);
		frame.setVisible(true);
	}
}