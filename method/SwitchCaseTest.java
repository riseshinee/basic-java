package method;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day;
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: //연속적으로도 사용 가능
                day = 31;
                break;//switch 를 빠져나갈 수 있음
            case 2: day = 28;
                break;
            case 4: day = 30;
                break;         
            case 6: day = 30;
                break;
            case 9: day = 30;
                break;            
            case 11: day = 30;
                break;
            default:
                day = -1;
        }
    System.out.println(month+"월 "+day+"일");
    }
}
