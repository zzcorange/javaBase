package otherpackage;

import authority.Father;

import java.math.BigInteger;

/**
 * @Author chengzi
 * @Date 2018/8/20 21:01
 */
public class OtherPackage {
    byte b;
    public  void testInit(){
        System.out.println(b);
    }
    public static void main(String...agrs){
        Father father = new Father();
     //   System.out.println(father.);
        BigInteger bigInteger = new BigInteger("1222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");

//        System.out.println(bigInteger.multiply(bigInteger));
    new OtherPackage().testInit();
    }
}
