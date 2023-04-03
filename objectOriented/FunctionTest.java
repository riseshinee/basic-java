package objectOriented;

public class FunctionTest {
    
    public static int addNum(int num1, int num2){
        return num1+num2;
    }

    public static void sayHello(String greeting){
        System.out.println(greeting);
    }
    
    public static int calcSum(){
        int sum = 0;
        int i;
        for(i = 0; i<=100; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        int total = addNum(10,20);
        System.out.println(total);

        sayHello("hello 안녕하세요");

        total = calcSum();
        System.out.println(total);
    }
}
