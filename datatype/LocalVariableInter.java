package datatype;

public class LocalBariableInter {

    public static void main(String[] args){
        var i = 10;
        var j = 10.0;
        var str = "test";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;
        System.out.println(str2);

        //str = 3; // error
        //변수 타입이 선언되면 그 타입을 바꿀 수  없음
    }
    
}
