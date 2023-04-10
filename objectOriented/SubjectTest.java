package objectOriented;

public class SubjectTest {
    
    public static void main(String[] args){
        SubjectStudent kano = new SubjectStudent(100, "kano");
        kano.setKoreaSubject("국어", 100);
        kano.setMathSubject("수학", 100);

        kano.showScoreInfo();
    }
}
