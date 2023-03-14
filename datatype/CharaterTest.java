package datatype;

public class CharaterTest {
    
    public static void main(String[] args){
        char ch1 = 'A';
        System.out.println((int)ch1); //int로 강제 변환함

        char ch2 = 66;
        System.out.println((char)ch2); 

        int ch3 = 67;
        System.out.println((char)ch3); 

        char han = '한';
        char ch = '\uD55C';
        System.out.println(ch); 
    }
}
