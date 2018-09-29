package basepackage;

/**
 * @Author chengzi
 * @Date 2018/9/8 9:47
 *j 基类
 */
public class FatherClass {
    public void method1(){
        System.out.println("this is fatherClass method1 public");
    }

    /**
     * 包访问权限，不允许其他包的子类访问
     */
    void method2(){
        System.out.println("this is factherClass method2 package");
    }
    protected  void method3(){
        System.out.println("this is fatherClass  method3 protected");
    }
    private void method4(){
        System.out.println("this is fatherClass method4 private");
    }
    public static void main(String...args){
        TestNoPublic testNoPublic = new TestNoPublic();
        testNoPublic.test();

    }
}
