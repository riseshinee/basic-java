package method;

/* while
 * 조건이 참인 동안 반복 수행, 조건이 맞지 않으면 수행되는 부분이 없음
 * 
 * do-while
 * 조건이 참인 동안 반복 수행, 수행문을 먼저 수행하고 조건 체크
 * 
 * for
 * 초기화, 조건 체크, 증감 순으로 수행
 */
public class ForTest {
    public static void main(String[] args){

        int count = 1;
        int sum = 0;

        for(int i = 0; i < 10; i++, count++){
            sum += count;
        }
        System.out.println(sum);

        int num = 1;
        int total = 0;

        while( num <= 10){
            total += num++;
        }
        System.out.println(total);

    }
}
