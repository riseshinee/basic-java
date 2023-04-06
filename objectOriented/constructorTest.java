package objectOriented;

public class constructorTest {
    public int studentNumber;
	public String studentName;
	public int grade;

	//클래스명과 동일하게 설정해야함
	public constructorTest() {} //기본 생성자 생성 (생성자가 아무것도 없을 때)

	//파라미터가 필수 일 때는 기본 생성자를 제공하지 않는다.
	public constructorTest(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}

    
}
