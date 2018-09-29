package implement;

import basepackage.FlyFather;
import interfaces.IntefaceTest;

/**
 * @Author chengzi
 * @Date 2018/9/15 10:19
 */
public class FlyImplement extends FlyFather  implements IntefaceTest {
    public static void main(String...args){
        new FlyImplement().canFly();
    }
}
