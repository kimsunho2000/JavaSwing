package week9_2;

import java.awt.Dimension;
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
		this.setLocation(BLW_x, BLW_y);

		JPanel panel = new JPanel();
		// JLabel l1 = new JLabel("도서 정보 목록");
		String str = "";
		int count = 0;
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
			// p1.add(l1);
		}
		add(panel);
		setVisible(true);

	}

}