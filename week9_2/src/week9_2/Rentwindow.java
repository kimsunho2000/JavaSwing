package week9_2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Rentwindow extends JFrame {
	static final int NUMBER_OF_ITEMS = 8;
	static final int SIZE_OF_WIDTH = 300;
	static final int SIZE_OF_HEIGHT = 500;
	static final int ITEM_SIZE_HEIGHT = 50;
	static final String FRAME_TITLE = "도서 대출";
	static final String GUIDE_TEXT = "아래에 항목을 입력하세요.";

	Rentwindow(int Main_x, int Main_Y) {
		setSize(SIZE_OF_WIDTH, SIZE_OF_HEIGHT);
		setLocation(Main_x, Main_Y);
		setTitle("도서 대출");

		JPanel panel = new JPanel();
		JPanel p1 = new JPanel();
		p1.setPreferredSize(new Dimension(300, 50));
		JPanel[] p = new JPanel[NUMBER_OF_ITEMS];
		for (int n = 0; n < NUMBER_OF_ITEMS; n++) {
			p[n] = new JPanel();
			p[n].setPreferredSize(new Dimension(SIZE_OF_WIDTH, ITEM_SIZE_HEIGHT));
			panel.add(p[n]);
		}
		JLabel guide = new JLabel(GUIDE_TEXT);
		p[0].add(guide);

		JTextField t1 = new JTextField(15); // 리팩토링 할 코드
		JLabel l1 = new JLabel("  책 제 목  ");
		p[1].add(l1);
		p[1].add(t1);
		JTextField t2 = new JTextField(15);
		JLabel l2 = new JLabel(" 대출자  ");
		p[2].add(l2);
		p[2].add(t2);
		JTextField t3 = new JTextField(15);
		JLabel l3 = new JLabel(" 전화번호 ");
		p[3].add(l3);
		p[3].add(t3);
		JTextField t4 = new JTextField(15);
		JLabel l4 = new JLabel(" 학번 ");
		p[4].add(l4);
		p[4].add(t4);

		JLabel l5 = new JLabel(" 대출일 ");
		JTextField yy = new JTextField(5);
		JTextField mm = new JTextField(5);
		JTextField dd = new JTextField(5);
		p[5].add(l5);
		p[5].add(yy);
		p[5].add(mm);
		p[5].add(dd);
		JLabel l6 = new JLabel(" 반납일 ");
		JTextField yy2 = new JTextField(5);
		JTextField mm2 = new JTextField(5);
		JTextField dd2 = new JTextField(5);
		p[6].add(l6);
		p[6].add(yy2);
		p[6].add(mm2);
		p[6].add(dd2);

		JButton b1 = new JButton("확		인");
		JButton b2 = new JButton("취		소");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // call back
				// TODO Auto-generated method stub
				String bookTitle = t1.getText();
				for (int i = 0; i < BookRegister.bookData.size(); i++) {
					if (bookTitle.equals(BookRegister.bookData.get(i).getTitle())) {
						// BookRegister.bookData.get(i).setRentAvailable(false);
						Book old = BookRegister.bookData.get(i);
						Book newData = new Book(old.getPublisher(), old.getTitle(), old.getAuthor(), old.getISBN(),
								old.category, old.getPage());
						String name = t2.getText(), number = t3.getText(), id = t4.getText();
						newData.Student = new Student(name, number, id);
						newData.rentAvailable = false;
						int rent_yy = Integer.parseInt(yy.getText());
						int rent_mm = Integer.parseInt(mm.getText());
						int rent_dd = Integer.parseInt(dd.getText());
						newData.rentday = new Date(rent_yy,rent_mm,rent_dd);
						int return_yy = Integer.parseInt(yy2.getText());
						int return_mm = Integer.parseInt(mm2.getText());
						int return_dd = Integer.parseInt(dd2.getText());
						newData.returnday = new Date(return_yy,return_mm,return_dd);
						BookRegister.bookData.set(i, newData);
						break;
					}
				}

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