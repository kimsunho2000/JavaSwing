package week9_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.Scanner;

public class BookRegister {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Book> bookData = new ArrayList<Book> ();

	static void registerBook(String publisher, String title, String author, String ISBN, String category, String page) {
		Book newBook = new Book(publisher, title, author, ISBN, Integer.parseInt(category), Integer.parseInt(page));
		bookData.add(newBook);
	}

	public static void main(String[] args) throws InterruptedException {
		Mainframe frame = new Mainframe();

	}
}