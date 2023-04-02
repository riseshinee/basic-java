package method;

import java.util.Scanner;

/* do - while
 * 조건과 상관 없이 한번은 수행문을 수행
 * do{
 *  수행문1;
 * }while(조건식);
 *  수행문2;
 */

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        input = scanner.nextInt();

        do{
            input = scanner.nextInt();
            sum += input;
        }while( input != 0); // do 가 실행 될 조건, 조건에 맞지 않으면 break;
        
        System.out.println(sum);
    }
    
}
