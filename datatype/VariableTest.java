package datatype;

public class VariableTest {
    public static void main(String[] args){
        byte bNum = 127;

        System.out.println(bNum);

        long lNum = 12345678900L;
        System.out.println(lNum);
    }
}
/* 
int 
자바에서 사용하는 정수에 대한 기본 자료 형
4바이트 단위의 자료형
프로그램에서 사용하는 모든 숫자(리터럴)은 int 로 저장됨
32 비트를 초과하는 숫자는 long 자료형으로 처리

long
8바이트 자료형
숫자의 뒤에 알파벳 L 또는 l 을 써서 long 형임을 표시 함

예) int num = 12345678900; // 오류 
long lnum = 12345678900; //오류 
long lnumber = 12345678900L; // ok
*/