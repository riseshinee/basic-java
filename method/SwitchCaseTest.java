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

        int day2 = switch (month) {
            case 1,3,5,7,8,10,12-> 31;

            case 2-> 28;

            case 4,6,9,11 -> 30;

            default-> {
                yield -1;
            }
        }
    System.out.println(month+"월 "+day+"일");
    }
}
