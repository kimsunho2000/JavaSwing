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
		JPanel[] p = new JPanel[11];
		for (int n = 0; n < 11; n++) {
			p[n] = new JPanel();
			p[n].setPreferredSize(new Dimension(Rentwindow.SIZE_OF_WIDTH, 20));
			panel.add(p[n]);
		}
		panel.setPreferredSize(new Dimension(400, 400));
		JLabel publisher = new JLabel("출판사:" + book.getPublisher());
		JLabel title = new JLabel("제목:" + book.getTitle());
		JLabel author = new JLabel("저자:" + book.getAuthor());
		JLabel ISBN = new JLabel("ISBN:" + book.getISBN());
		JLabel category = new JLabel("카테고리:" + Integer.toString(book.getCategory()));
		JLabel page = new JLabel("페이지수:" + Integer.toString(book.getPage()));
		p[0].add(publisher);
		p[1].add(title);
		p[2].add(author);
		p[3].add(ISBN);
		p[4].add(category);
		p[5].add(page);
		p[6].setVisible(true);

		if (book.rentAvailable == false) {
			JLabel rent = new JLabel("대출여부 : 대출중");
			JLabel student = new JLabel("대출인 :" + book.Student.toString());
			JLabel rentDate = new JLabel("대출일 :" + book.rentday.dateToString());
			JLabel returnDate = new JLabel("반납일 :" + book.returnday.dateToString());
			p[7].add(rent);
			p[8].add(student);
			p[9].add(rentDate);
			p[10].add(returnDate);
		} else {
			JLabel rent = new JLabel("대출여부 : 대출 없음");
			p[7].add(rent);
		}
		add(panel);
		setVisible(true);
	}
}