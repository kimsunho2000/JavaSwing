package week9_2;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BookListWindow extends JFrame {
	BookListWindow(int BLW_x, int BLW_y) {
		setSize(Mainframe.MAIN_WINDOW_WIDTH, Mainframe.MAIN_WINDOW_WIDTH);
		setTitle("도서 목록 조회");
		String str = "";
		int count = 0;
		this.setLocation(BLW_x, BLW_y);
		JPanel panel = new JPanel();
		JButton Refresh = new JButton();
		Refresh.setText("새로고침");
		panel.add(Refresh);
		Refresh.addActionListener(new ActionListener() { //새로고침 기능 구현

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); //원래 있던 프레임을 닫기
				Point p = Mainframe.me.getLocation(); //다시 실행
				new BookListWindow(p.x + 2 * Mainframe.MAIN_WINDOW_WIDTH, p.y);
				
			}
			
		});
		for (Book book : BookRegister.bookData) {
			JLabel l2 = new JLabel();
			str = book.getPublisher() + " " + book.getTitle() + " " + book.getAuthor() + " " + book.getISBN() + " "
					+ book.getCategory() + " " + book.getPage();
			str += ((book.rentAvailable) ? "대출가능" : "대출중") + "\r\n";
			l2.setText(str);
			JButton b = new JButton();
			b.setText(++count + "");
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton) e.getSource();
					int index = Integer.parseInt(b.getText());
					Book book = BookRegister.bookData.get(index - 1);
					// book data
					new BookInfowindow(book);

				}
			});
			JPanel p1 = new JPanel();
			p1.setPreferredSize(new Dimension(500, 35));
			p1.add(b);
			p1.add(l2);
			panel.add(p1);
			
		}
		add(panel);
		setVisible(true);

	}

}