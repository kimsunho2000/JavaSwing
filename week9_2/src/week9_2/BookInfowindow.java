package week9_2;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BookInfowindow extends JFrame {
	BookInfowindow(Book book) {
		setSize(Rentwindow.SIZE_OF_WIDTH, Rentwindow.SIZE_OF_HEIGHT);
		setLocation(300, 300);
		setTitle("도서 상세 정보");
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 300));
		JLabel publisher = new JLabel(book.getPublisher());
		JLabel title = new JLabel(book.getTitle());
		JLabel author = new JLabel(book.getAuthor());
		JLabel ISBN = new JLabel(book.getISBN());
		JLabel category = new JLabel(Integer.toString(book.getCategory()));
		JLabel page = new JLabel(Integer.toString(book.getPage()));
		panel.add(publisher);
		panel.add(title);
		panel.add(author);
		panel.add(ISBN);
		panel.add(category);
		panel.add(page);
		panel.setVisible(true);

		if (book.rentAvailable == false) {
			JLabel rent = new JLabel("대출여부 : 대출중");
			JLabel student = new JLabel("대출인 :" + book.Student.toString());
			JLabel rentDate = new JLabel("대출일 :" + book.rentday.dateToString());
			JLabel returnDate = new JLabel("반납일 :" + book.returnday.dateToString());
			panel.add(rent);
			panel.add(student);
			panel.add(rentDate);
			panel.add(returnDate);
		} else {
			JLabel rent = new JLabel("대출여부 : 대출 없음");
			panel.add(rent);
		}
		add(panel);
		setVisible(true);
	}
}