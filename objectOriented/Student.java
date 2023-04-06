package objectOriented;

//메서드 만들기 연습
public class Student {
    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo(){
        System.out.println(
            studentID+"/"+studentName+"/"+address
        );
    }

    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){
        studentName = name;
    }
    
}
