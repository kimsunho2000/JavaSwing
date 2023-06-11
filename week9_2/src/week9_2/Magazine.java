package week9_2;

public class Magazine extends Book {
	int serial;
	int month;
	int category = 2;

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	Magazine(String publisher, String title, String author, String ISBN, int category, int page, int serial,
			int month) {
		super(publisher, title, author, ISBN, category, page);
		this.serial = serial;
		this.month = month;
		this.category = category;
		// TODO Auto-generated constructor stub
	}

	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("시리얼번호" + serial);
		System.out.println("월간" + month);

	}

	@Override
	void scanInfo() {
		super.scanInfo();
		System.out.print("시리얼:");
		this.serial = sc.nextInt();
		System.out.print("호차:");
		sc.nextLine();
		this.month = sc.nextInt();

	}
}