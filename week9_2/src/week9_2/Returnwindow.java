package week9_2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Returnwindow extends JFrame {
	Returnwindow(int BLW_x, int BLW_y) {
		setSize(Mainframe.MAIN_WINDOW_WIDTH, Mainframe.MAIN_WINDOW_WIDTH);
		setTitle("도서 반납");
		this.setLocation(BLW_x, BLW_y);
		JPanel panel = new JPanel();
		JPanel p1 = new JPanel();
		p1.setPreferredSize(new Dimension(300, 50));
		JPanel[] p = new JPanel[Rentwindow.NUMBER_OF_ITEMS];
		for (int n = 0; n < Rentwindow.NUMBER_OF_ITEMS; n++) {
			p[n] = new JPanel();
			p[n].setPreferredSize(new Dimension(Rentwindow.SIZE_OF_WIDTH, Rentwindow.ITEM_SIZE_HEIGHT));
			panel.add(p[n]);
		}
		JLabel guide = new JLabel(Rentwindow.GUIDE_TEXT);
		p[0].add(guide);

		JTextField t1 = new JTextField(15);
		JLabel l1 = new JLabel("  책 제 목  ");
		p[1].add(l1);
		p[1].add(t1);
		JTextField t2 = new JTextField(15);
		JLabel l2 = new JLabel("  대 출 자  ");
		p[2].add(l2);
		p[2].add(t2);
		for (int t = 0; t < Rentwindow.NUMBER_OF_ITEMS; t++) {
			panel.add(p[t]);
		}
		this.add(panel);
		setVisible(true);
		JButton b1 = new JButton("반	       납");
		p[3].add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // 반납 버튼 클릭시 이벤트 처리,대출여부를 true로 설정
				// TODO Auto-generated method stub
				String bookTitle = t1.getText();
				String Name = t2.getText();
				for (int i = 0; i < BookRegister.bookData.size(); i++) {
					if (bookTitle.equals(BookRegister.bookData.get(i).getTitle())
							&& Name.equals(BookRegister.bookData.get(i).Student.getRenterName())) {
						Book old = BookRegister.bookData.get(i);
						old.rentAvailable = true;
						BookRegister.bookData.set(i, old);
						break;
					}
				}
			}

		});

	}

}
