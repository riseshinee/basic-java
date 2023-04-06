package objectOriented;

public class StudentTest {
    public static void main(String[] args){

        Student student = new Student(); //인스턴스
        //클래스를 기반으로 여러개의 인스턴스를 생성함
        student.studentID = 1;
        student.setStudentName("test");
        student.address = "seoul";

        student.showStudentInfo();
    }
    
}
