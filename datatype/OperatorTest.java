package datatype;

public class OperatorTest {
    
    public static void main(String[] args){
        int gameScore = 150;
        //int lastScore = ++gameScore; //1씩 증가
        int lastScore2 = gameScore++; //1씩 증가

        //System.out.println(lastScore); 
        System.out.println(lastScore2); 
        System.out.println(gameScore); 
    }
}
