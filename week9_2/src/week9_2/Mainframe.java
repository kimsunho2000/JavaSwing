package week9_2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Mainframe extends JFrame {
	static final int MAIN_WINDOW_WIDTH = 400;
	static final int MAIN_WINDOW_HEIGHT = 100;
	static Mainframe me;

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
		JButton b4 = new JButton();
		b4.setText("반     납");

		p1.add(l1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
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
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Point p = me.getLocation();
				new Returnwindow(p.x + 3 * MAIN_WINDOW_WIDTH, p.y);
			}
		});
		panel.add(p1);
		panel.add(p2);
		frame.add(panel);
		frame.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
