package week9_2;

public class Date {
	int year, month, day;

	Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	String dateToString() {
		return new String(year + "년" + month + "월" + day + "일");
	}

}