package week9_2;

public class Student {
	private String renterName;
	private String phoneNumber;
	private String id;
	private Date rentDay;
	private Date receiveDay;

	Student(String renterName, String phoneNumber, String id) {
		this.renterName = renterName;
		this.phoneNumber = phoneNumber;
		this.id = id;
	}

	public String getRenterName() {
		return renterName;
	}

	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhonenumber(String phoneNumber) {
		if (phoneNumber.length() > 13) {
			phoneNumber = "null"; // 핸드폰 번호자리수가 13이 초과하면 null값으로 초기화
		} else
			this.phoneNumber = phoneNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id.length() > 8) {
			id = "null"; // 학번 번호자리수가 8을 초과하면 null값으로 초기화
		} else
			this.id = id;
	}

	public void printStudentInfo() {
		System.out.println("학생이름:" + getRenterName());
		System.out.println("전화번호:" + getPhoneNumber());
		System.out.println("학번:" + getId());

	}

	@Override
	public String toString() {
		return renterName + " " + phoneNumber + " " + id;
	}
}