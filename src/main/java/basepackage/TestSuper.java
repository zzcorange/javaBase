package basepackage;

/**
 * @Author chengzi
 * @Date 2018/9/13 21:14
 */
public class TestSuper {
    private int a = PrintInt.print();
    TestSuper(int i){
        System.out.println("In TestSuper构造器");
    }
    TestSuper(int a,int b){}
    public static void print(){
        System.out.println("I am super print");
    }
}
