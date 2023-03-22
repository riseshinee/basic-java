package datatype;

public class OperatorTest {
    
    public static void main(String[] args){
        int gameScore = 150;
        //int lastScore = ++gameScore; //lastScore = gameScore + 1
        int lastScore = gameScore++; //lastScore = gameScore, gameSocre += 1

        System.out.println(lastScore); 
        System.out.println(gameScore); 
    }
}
