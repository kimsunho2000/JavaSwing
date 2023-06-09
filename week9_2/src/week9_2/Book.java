package week9_2;

import java.util.Scanner;

public class Book {
	Scanner sc = new Scanner(System.in);
	private int rentStudentIndex;
	private String publisher;
	private String title;
	private String author;
	private String ISBN;
	protected int category = 1; // 1:단행본, 2:간행본
	private int page;
	public boolean rentAvailable = true;
	protected Student Student;
	Date rentday;
	Date returnday;

	Book(String publisher, String title, String author, String ISBN, int category, int page) {
		this.publisher = publisher;
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.category = category;
		this.page = page;
	}

	public int getRSI() {
		return rentStudentIndex;
	}

	public void setRSI(int rentStudentIndex) {
		this.rentStudentIndex = rentStudentIndex;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public boolean getRentAvailable() {
		return rentAvailable;
	}

	public void setRentAvailable(boolean rentAvailable) {
		this.rentAvailable = rentAvailable;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Date getRentDay() {
		return rentday;
	}

	public void setRentDay(Date rentDay) {
		this.rentday = rentDay;
	}

	public Date getRecieveDay() {
		return returnday;
	}

	public void setRecieveDay(Date receiveDay) {
		this.returnday = receiveDay;
	}

	void printInfo() {
		System.out.println("대출자:" + Student);
		System.out.println("제목:" + title);
		System.out.println("출판사:" + publisher);
		System.out.println("저자:" + author);
		System.out.println("ISBN:" + ISBN);
		System.out.println("도서구분:" + category);
		System.out.println("페이지수:" + page);
		System.out.println("렌트가능:" + rentAvailable);

	}

	void scanInfo() {
		System.out.print("제목:");
		this.title = sc.nextLine();
		System.out.print("저자:");
		this.author = sc.nextLine();
		System.out.print("출판사:");
		this.publisher = sc.nextLine();
		System.out.print("페이지수:");
		this.page = sc.nextInt();
		System.out.print("ISBN:");
		sc.nextLine();
		this.ISBN = sc.nextLine();
	}

}