package basepackage;

/**
 * @Author chengzi
 * @Date 2018/9/8 9:54
 */
public class TheSamePackageChild extends  FatherClass {
    public void testFather(){
        super.method2();
        super.method3();
    }

    public static void main(String...args){
        new TheSamePackageChild().testFather();
        new FatherClass().method3();
    }
}
