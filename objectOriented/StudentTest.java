package objectOriented;

public class StudentTest {
    public static void main(String[] args){

        Student student = new Student(); //인스턴스, 참조변수
        //클래스를 기반으로 여러개의 인스턴스를 생성함
        //앤스턴스가 생성되는 메모리 : 힙 메모리
        //지역변수는 스택 메모리

        student.studentID = 1;
        student.setStudentName("test");
        student.address = "seoul";

        student.showStudentInfo();
    }
    
}
