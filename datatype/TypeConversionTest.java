package datatype;

public class TypeConversionTest {
    
    public static void main(String[] args){
        byte bNum = 125;
        int iNum = 225;
        //byte jNum = iNum; // error
        byte jNum = (byte)iNum;//강제로 형변환 함

        System.out.println(jNum);

        double dNum = 1.2;
        float fNum = 0.9F;
        int xNum1 = (int)dNum + (int)fNum;
        int xNum2 = (int)(dNum + fNum);

        System.out.println(xNum1); //형번환을 어떻게 하느냐에 따라 결과가 다름
        System.out.println(xNum2);
    }

}
